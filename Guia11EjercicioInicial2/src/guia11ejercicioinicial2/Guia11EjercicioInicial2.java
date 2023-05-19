/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ejercicioinicial2;

import Entidad.Equipo;
import Entidad.Jugador;
import java.util.ArrayList;
/**
 *Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 * @author Flia-Santillan
 */
public class Guia11EjercicioInicial2 {

    public static void main(String[] args) {
        
        Equipo river = new Equipo();
          
        Jugador j1 = new Jugador("Lucas", "Beltran", 10, 10);
        Jugador j2 = new Jugador("Milton", "Casco", 4, 4);
        Jugador j3 = new Jugador("Enzo", "Perez", 5, 5);
        Jugador j4 = new Jugador("Franco", "Armani", 1, 1);
        
        river.getListaJugadores().add(j1);
        river.getListaJugadores().add(j2);
        river.getListaJugadores().add(j3);
        river.getListaJugadores().add(j4);
        
        System.out.println("*** EQUIPO ****");
        
        System.out.println(river);
        
        System.out.println("***** EQUIPO RIVER ******");
        
        for (Jugador aux : river.getListaJugadores()) {
            System.out.println(aux);
        }
        
       
}
}