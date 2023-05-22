package Main;

import Juego.Juego;
import Jugador.Jugador;
import Revolver.Revolver;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Flia-Santillan
 */
public class Guia11Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
               
        Juego jue = new Juego();
        
        jue.llenarJuego();
        jue.ronda();
        
        
    }   
    
}
