
package guia11ejercicio1;

import Entidad.Perro;
import Entidad.Persona;
import java.util.Scanner;

/**
 *Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 * @author Flia-Santillan
 */
public class Guia11Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
       
        Persona p1 = new Persona();
        p1.setNombre("Juan");
        p1.setApellido("Perez");
        p1.setDocumento(25700500);
        
        Persona p2 = new Persona();
        p2.setNombre("Jose");
        p2.setApellido("Gomez");
        p2.setDocumento(30100200);
        
        Perro pe1 = new Perro();
        pe1.setNombre("Chiquito");
        pe1.setRaza("Beagle");
        pe1.setEdad(5);
        pe1.setTamaño("Medio");
        
        Perro pe2 = new Perro();
        pe2.setNombre("Lola");
        pe2.setRaza("Caniche");
        pe2.setEdad(10);
        pe2.setTamaño("Chico");
        
        System.out.println("Hola "+p1.getNombre());
        System.out.println(" Elegi, que perro deseas adoptar? ");
        System.out.println("Opcion 1: "+pe1);
        System.out.println("Opcion 2: "+pe2);
        int opcion = leer.nextInt();
        
        if (opcion==1) {
            p1.setP1(pe1);
            p2.setP1(pe2);
            
        } else {
            p1.setP1(pe2);
            p2.setP1(pe1);
        }
        
        System.out.println(p1.getNombre() + " adopto a " + p1.getP1().getNombre());
        System.out.println(p1.toString());
        System.out.println("*************************************");
       System.out.println(p2.getNombre()+ " adopto a "+ p2.getP1().getNombre());
        System.out.println(p2.toString());
        
        
        
        
        
        
        
        
    }
    
}
