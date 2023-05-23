package guia11ejercicioextra1;

import Perro.Perro;
import Persona.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
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
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        Perro perro1 = new Perro();
        Persona per1 = new Persona();
        
        perro1.CargarPerro();
        perro1.mostrarPerro();
        
        
        
        
        
        /*
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
      */
    }
    ArrayList<Perro> listaPerro = new ArrayList();
    
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
        for (Perro perro : listaPerro) {
            System.out.println(perro);
        }
        System.out.println("");
    }
    
    // ***********PERSONAS ***************
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
     private ArrayList<Persona> listaPersonas = new ArrayList();
    
    public void CargarPersona() {
        System.out.println("Se cargan 10 personas");
        int cantPersona = 10;

        for (int i = 0; i < cantPersona; i++) {
            Persona p1 = new Persona();

            p1.setNombre("Persona " + (i + 1));
            p1.setApellido("Apellido " + (i + 1));
            p1.setDocumento((int) (Math.random() * 10000000 + 1));

            listaPersonas.add(p1);
        }
    }

    public void mostrarPersona() {

        System.out.println("");
        System.out.println("***Lista de Personas***");

        for (Object aux : listaPersonas) {
            System.out.println(aux);
        }
        System.out.println("");
    }

    public void AdoptarPerro() {
        System.out.println("Ingre>se Nombre del perro que desea adoptar:");
        String nombrePerro = leer.next();

    }

}


        
        
        
    
    

