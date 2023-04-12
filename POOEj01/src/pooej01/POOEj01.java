
package pooej01;

import Entidad.Libro;
import Entidad.Persona;
import java.util.Scanner;


public class POOEj01 {

    
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
       
        //Instanciacion usando el constructor vacio
        Persona persona1 = new Persona();
        
        //Instanciacion usando el constructor por parametros
        Persona persona2 = new Persona("Oscar");
        
         //Instanciacion usando el constructor con todos los parametros
        Persona persona3 = new Persona("Sebastian",5,"Argentino");
        
        Persona persona4 = new Persona("Alfredo");
        
        System.out.println("La persona 3 se llama "+persona3.nombre+" tiene "+persona3.edad+" años y es "+persona3.nacionalidad );
        System.out.println("La persona 2 se llama "+persona2.nombre);
        System.out.println("La persona 4 se llama "+persona4.nombre);
        persona4.setNombre("Pepe");
        
           System.out.println("\nLa persona 4 ahora se llama "+persona4.nombre);
    
           
           System.out.println("\n------LIBROS-------");        
           
           Libro libro1 = new Libro(1234567891, "Practica POO I", "EGG",100);
           
           
           
           System.out.println("libro 1, \n ISBN : "+libro1.isbn+"\n Titulo: "+libro1.titulo+"\n Autor: "+libro1.autor+"\n Nro de paginas "+libro1.nroPaginas);
        
           
          
           
           
           
        Libro libro2 = new Libro();
        
        libro2.cargarLibro();
        libro2.mostrarLibro();
        
           
    
    
    
    }
    
    
    
    
}
