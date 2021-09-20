
package Logica;

import Persistencia.ControladoraPersistencia;


public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    
    public void altaRegistro(int num_cliente, String nombre_perro, String raza, String color, boolean alergico, boolean atención_especial, String nombre_duenio, String celular_duenio, String observaciones) {
        //Creando mi objeto RegistroCanino
        RegistroCanino regs = new RegistroCanino();
        
        //Preparando los datos en las variables de regs, para dar de alta un registro
        regs.setNum_cliente(num_cliente);
        regs.setNombre_perro(nombre_perro);
        regs.setRaza(raza);
        regs.setColor(color);
        regs.setAlergico(alergico);
        regs.setAtención_especial(atención_especial);
        regs.setNombre_duenio(nombre_duenio);
        regs.setCelular_duenio(celular_duenio);
        regs.setObservaciones(observaciones);
        
        controlPersis.altaRegistro(regs);        
        

    }
    
    
}
