
package Entidad;

/**
 *Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 * @author Flia-Santillan
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Dni datosDni;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Dni datosDni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.datosDni = datosDni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Dni getDatosDni() {
        return datosDni;
    }

    public void setDatosDni(Dni datosDni) {
        this.datosDni = datosDni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido +" , " +datosDni + '}';
    }
    
    
}
