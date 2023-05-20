/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ejercicio2ok;

import Juego.Juego;
import Jugador.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Flia-Santillan
 */
public class Guia11Ejercicio2OK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();

        System.out.println("Ingrese la cantidad de jugadores (entre 1 y 6):");
        int cantidadJugadores = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= cantidadJugadores; i++) {
            jugadores.add(new Jugador(i));
        }

        Juego juego = new Juego();
        juego.llenarJuego(jugadores);

        juego.ronda();
        
    }
}
    
    

