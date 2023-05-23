/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ejercicio3;

import Baraja.Baraja;
import java.util.Scanner;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author Flia. SANTILLAN
 */
public class Guia11Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Baraja bar = new Baraja();
         int opcion;
         
        bar.crearCarta();
      
        System.out.println("Se creo una baraja con 40 cartas !!!");
        System.out.println("");
     
        do {
         
        System.out.println("Seleccione una opcion \n"
                + "1- Mezclar la Baraja\n"
                + "2- Mostrar la Baraja\n"
                + "3- Mostrar la siguiente carta\n"
                + "4- Mostrar varias cartas\n"
                + "5- Mostrar las cartas ya entregadas\n"
                + "6- Cartas disponibles en la baraja\n"
                + "7- Salir");
        
        opcion= leer.nextInt();
        
        switch (opcion) {
            case 1:
                    bar.barajar();
                break;
            case 2:
                    bar.mostrarBaraja();
                break;
            case 3:
                    bar.siguienteCarta();
                break;
            case 4:
                    bar.darCartas();
                break;
            case 5:
                    bar.cartasMonton();
                break;
            case 6:
                    bar.cartasDisponibles();
                break;
            case 7:
                    System.out.println("Muchas gracias");
                    System.out.println("");
                break;       
            default:
                System.out.println("Opcion Invalida");
        }
      } while (opcion!=7);
    }
    
        
}
