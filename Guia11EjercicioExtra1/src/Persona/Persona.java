package Persona;

import Perro.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
* 
 * @author Flia-Santillan
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int documento;
    private Perro p1;
    private ArrayList<Persona> listaPersonas = new ArrayList();
     

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
    



