
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //Declaro mi entidad
public class RegistroCanino implements Serializable {
    
   //Atributos de mi clase
    @Id 
    private int num_cliente;
    
    @Basic
    private String nombre_perro;
    private String raza;
    private String color;
    private boolean alergico;
    private boolean atención_especial;
    private String nombre_duenio; 
    private String celular_duenio;
    private String observaciones;

    //Constructor vacio
    public RegistroCanino() {
    
    }
    
    //Cosntructor con parametros
    public RegistroCanino(int num_cliente, String nombre_perro, String raza, String color, boolean alergico, boolean atención_especial, String nombre_duenio, String celular_duenio, String observaciones) {
        this.num_cliente = num_cliente;
        this.nombre_perro = nombre_perro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atención_especial = atención_especial;
        this.nombre_duenio = nombre_duenio;
        this.celular_duenio = celular_duenio;
        this.observaciones = observaciones;
    }
    
    //Mis Getters y Setters

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public boolean isAtención_especial() {
        return atención_especial;
    }

    public void setAtención_especial(boolean atención_especial) {
        this.atención_especial = atención_especial;
    }

    public String getNombre_duenio() {
        return nombre_duenio;
    }

    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    public String getCelular_duenio() {
        return celular_duenio;
    }

    public void setCelular_duenio(String celular_duenio) {
        this.celular_duenio = celular_duenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
        
    
    
}
