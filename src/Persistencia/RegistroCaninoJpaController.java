
package Persistencia;

import Logica.RegistroCanino;
import Persistencia.exceptions.NonexistentEntityException;
import Persistencia.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Chango
 */
public class RegistroCaninoJpaController implements Serializable {

    public RegistroCaninoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public RegistroCaninoJpaController() {
    
         emf = Persistence.createEntityManagerFactory("Alarcon_Walter_Tpo2_PU");   
    
    }


    public void create(RegistroCanino registroCanino) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(registroCanino);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findRegistroCanino(registroCanino.getNum_cliente()) != null) {
                throw new PreexistingEntityException("RegistroCanino " + registroCanino + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(RegistroCanino registroCanino) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            registroCanino = em.merge(registroCanino);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = registroCanino.getNum_cliente();
                if (findRegistroCanino(id) == null) {
                    throw new NonexistentEntityException("The registroCanino with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            RegistroCanino registroCanino;
            try {
                registroCanino = em.getReference(RegistroCanino.class, id);
                registroCanino.getNum_cliente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The registroCanino with id " + id + " no longer exists.", enfe);
            }
            em.remove(registroCanino);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<RegistroCanino> findRegistroCaninoEntities() {
        return findRegistroCaninoEntities(true, -1, -1);
    }

    public List<RegistroCanino> findRegistroCaninoEntities(int maxResults, int firstResult) {
        return findRegistroCaninoEntities(false, maxResults, firstResult);
    }

    private List<RegistroCanino> findRegistroCaninoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(RegistroCanino.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public RegistroCanino findRegistroCanino(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(RegistroCanino.class, id);
        } finally {
            em.close();
        }
    }

    public int getRegistroCaninoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<RegistroCanino> rt = cq.from(RegistroCanino.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
