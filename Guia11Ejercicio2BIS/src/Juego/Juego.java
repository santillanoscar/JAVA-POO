
package Juego;

import Jugador.Jugador;
import Revolver.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
* 
 * @author Flia. SANTILLAN
 */
public class Juego {
    
    private ArrayList <Jugador> jugadores = new ArrayList<Jugador>();
    private Revolver r;

    public Juego() {
    }

    public Juego(Revolver r) {
        this.r = r;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public void llenarJuego(){
    //llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
    //y el revolver para guardarlos en los atributos del juego.
        this.jugadores = jugadores;
        this.r = r;
        
        System.out.println("Ingrese cantidad de Usuarios (1 a 6) ");
        int usuarios = leer.nextInt();
        
        for (int i = 0; i < usuarios; i++) {
                  
            Jugador j1 = new Jugador((i+1), "Jugador", false);
            jugadores.add(j1);
        }   
    }
    
    public void ronda() {
//    ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.

        int jugadorAux = 0;
        boolean jugadorMojado = false;

        for (Jugador aux : jugadores) {

            aux.disparo(r);
            System.out.println("Disparo " + aux);
            if (jugadorMojado) {
                jugadorMojado = true;
                break;
            }
        }
        if (!jugadorMojado) {
            System.out.println("¡Nadie se ha mojado! Siguiente ronda...");
            ronda();
        } else {
            System.out.println("¡Alguien se ha mojado!");
        }
    }
}
