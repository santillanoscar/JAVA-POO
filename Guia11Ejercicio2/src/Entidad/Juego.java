
package Entidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
* 
 * @author Flia-Santillan
 */
public class Juego {
    
    private ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
    private Revolver r1;

    public Juego() {
    }

    public Juego(Revolver r1) {
        this.r1 = r1;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public Revolver getR1() {
        return r1;
    }

    public void setR1(Revolver r1) {
        this.r1 = r1;
    }

    @Override
    public String toString() {
        return "Juego{" + "listaJugadores=" + listaJugadores + ", r1=" + r1 + '}';
    }
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public void llenarJuego(ArrayList<Jugador>listaJugadores, Revolver r){
//    llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.
        System.out.println("**** metodo llenar Juego**** ");
        System.out.println("Ingrese cantidad de Jugadores (1 a 6):");
        int cantJugadores=leer.nextInt();
        
        for (int i = 0; i < cantJugadores; i++) {
            
            Jugador j1 = new Jugador((i+1), "Jugador", false);
            listaJugadores.add(j1);
        }
        for (Jugador aux : listaJugadores) {
            System.out.println(aux);
        }
        this.r1 = new Revolver(); // Asigna la instancia de Revolver al atributo r1 de la clase Juego
        this.r1.llenarRevolver(); // prepara 1 Revolver
    }
    
    public void ronda(){
    
//    ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
        System.out.println("*** metodo ronda****");
        
        llenarJuego(listaJugadores, r1);
              
        for (Jugador aux : listaJugadores) {
            
            aux.disparo(r1);
            
        }
    }
    
}
