/*
Método juego(): el método juego se encargará de llamar todos los métodos 
previamente mencionados e informará cuando el usuario descubra toda la palabra
o se quede sin intentos. Este método se llamará en el main.
*/
package Main;

import Entidad.Ahorcado;
import Servicios.ServicioAhorcado;
import java.util.Scanner;

public class EjExtraAhorcado {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioAhorcado sa1 = new ServicioAhorcado();
        //Ahorcado a1 = new Ahorcado();
        
        sa1.juego();
        
        /*
        sa1.crearJuego();
        sa1.longitud();
        
        System.out.println("Ingrese una letra a buscar en la palabra:");
        String letra= leer.next().toUpperCase();
        sa1.buscar(letra);
         
        sa1.encontradas(letra);
        
        sa1.intentos();*/
      
        
        
       
        
        
        
    }
}
