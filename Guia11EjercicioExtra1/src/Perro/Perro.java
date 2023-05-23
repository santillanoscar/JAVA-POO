package Perro;

import Persona.Persona;
import java.util.ArrayList;
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
public class Perro {
    
    private String nombre;
    private String raza;
    private int edad;
    private String tamanio;
    private ArrayList <Perro> listaPerro= new ArrayList();
    private Persona dueño;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamanio, Persona dueño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.dueño = dueño;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamaño(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }
    
    public void CargarPerro(){
        
        String [] raza ={"Labrador","Bulldog","Golden retriever","Pastor alemán","Caniche","Buldog Frances","Beagle","Rottweiler","Braco alemán","Callejero"};
        String[] nombres ={"Chiquito","Terry","Toby","Felipe","Lola","Filomena","Negrito","Candy","Tango","Pimiento"};
        String[] tamanio ={"Grande","Mediano","Chico","Pequeño","Grande","Mediano","Chico","Pequeño","Chico","Pequeño"};

        System.out.println("** Se cargan 10 Perros ***");
        for (int i = 0; i < 10; i++) {
            Perro p1 = new Perro();
            p1.setRaza(raza[i]);
            p1.setNombre(nombres[i]);
            p1.setTamaño(tamanio[i]);
            p1.setEdad((int) (Math.random()* 10 +1));
            listaPerro.add(p1);
        }
     }
    
    public void mostrarPerro(){
        
        System.out.println("");
        System.out.println("***Lista de Perros***");
    
        for (Object aux : listaPerro) {
            System.out.println(aux);
        }
        System.out.println("");
    }
    
}
