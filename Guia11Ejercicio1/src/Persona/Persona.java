
package Persona;

import Perro.Perro;

/**
 *Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 * @author Flia-Santillan
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int documento;
    private Perro p1;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int documento, Perro p1) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.p1 = p1;
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

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getP1() {
        return p1;
    }

    public void setP1(Perro p1) {
        this.p1 = p1;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", p1=" + p1 + '}';
    }
    
    
    
}
