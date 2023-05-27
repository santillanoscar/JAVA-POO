
package guia11ejercicioExtra1;

import Perro.Perro;
import Persona.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
* 
* ******************** EXTRA 1 ******************************************
* Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
* 
 * @author Flia-Santillan
 */
public class Guia11EjercicioExtra1 {

    public static void main(String[] args) {
        ArrayList<Perro> listaPerro = new ArrayList();
        ArrayList<Persona> listaPersona = new ArrayList();
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
         
        System.out.println("Ingrese cantidad de Personas a agregar");
        System.out.println("Se agregaran igual cantidad de perros");
        int cant = leer.nextInt();
        
        for (int i = 0; i < cant; i++) {
            int edad= (int) (Math.random() * 15 + 1);
            
            Perro perro1 = new Perro("Perro"+(i+1), "Raza "+(i+1), edad, "Medio");
            listaPerro.add(perro1);
            
            int dni= (int) (Math.random() * 40000000 + 1);
            
            Persona p1 = new Persona("Persona "+(i+1), "Apellido "+(i+1), dni);
            listaPersona.add(p1);
        }
        
        adoptarPerro(listaPerro, listaPersona);
        
        System.out.println("");
        
        System.out.println("Lista de Personas y Perros adoptados");
        System.out.println("************************************************");
        
        for (Persona aux : listaPersona) {
            System.out.println(aux);
        }   
        System.out.println("");
        
        if (listaPerro.isEmpty()) {
            System.out.println("Todos los perros fueron adoptador");
        } else {
            System.out.println("Estos perros no fueron adoptados");
            for (Perro aux : listaPerro) {
                System.out.println("* "+aux.getNombre());
                System.out.println("");
            }
        }
        
        
    }
    
    public static void adoptarPerro(ArrayList<Perro> listaPerro, ArrayList<Persona> listaPersona) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        for (Persona auxPersona : listaPersona) {
            boolean noPerro = false;
            
            System.out.println("************************************************");
            System.out.println("                Hola " + auxPersona.getNombre());
            System.out.println("************************************************");
            System.out.println("Esta es la lista de Perros en espera de adopcion");
            System.out.println("------------------------------------------------");

            for (Perro auxPerro : listaPerro) {
                System.out.println("* "+ auxPerro.getNombre());
            }
            
            System.out.println("Ingresa el nombre del perro que deseas adoptar");
            String n = leer.next();
            for (Perro auxPerro2 : listaPerro) {
                if (auxPerro2.getNombre().equalsIgnoreCase(n)) {
                    auxPersona.setP1(auxPerro2);
                    System.out.println("Adoptaste a "+auxPerro2.getNombre());
                    System.out.println("");
                    listaPerro.remove(auxPerro2);
                    noPerro=false;
                    break;
                } else {
                    noPerro = true;
                }
            }
            if (noPerro) {
                System.out.println(" *** El perro ingresado no esta en la lista *** ");
                System.out.println("");
            }
        }
    }
   
}


