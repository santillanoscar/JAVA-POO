/*
 Implemente la clase Persona en el paquete entidades. Una persona tiene 
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, 
constructor parametrizado, get y set.
 */
package Entidad;

import java.util.Date;

public class Ej5Persona {
    
    private String nombre;
    private Date fechaNac;

    public Ej5Persona() {
    }

    public Ej5Persona(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Ej5Persona{" + "nombre=" + nombre + ", fechaNac=" + fechaNac + '}';
    }
    
    
}
