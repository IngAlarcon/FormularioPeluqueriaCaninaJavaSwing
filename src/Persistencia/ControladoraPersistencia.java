
package Persistencia;

import Logica.RegistroCanino;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    RegistroCaninoJpaController jpaRegistro = new RegistroCaninoJpaController();
    
//-------------------------------- METODO PARA REGISTRAR -------------------------------    

//metodo para crear     
    
    public void altaRegistro ( RegistroCanino reg){
        
        try {
            
            jpaRegistro.create(reg);
        
        } catch (Exception ex) {
        
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
        
        
    
    }
    
    
}
