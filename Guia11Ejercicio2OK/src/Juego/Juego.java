/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Jugador.Jugador;
import Revolver.Revolver;
import java.util.ArrayList;

/**
 *
 * @author Flia-Santillan
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
        jugadores = new ArrayList<>();
        revolver = new Revolver();
    }

    public void llenarJuego(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
        revolver.llenarRevolver();
    }

    public void ronda() {
        boolean alguienMojado = false;

        for (Jugador jugador : jugadores) {
            if (!jugador.estaMojado()) {
                boolean mojado = jugador.disparo(revolver);
                if (mojado) {
                    alguienMojado = true;
                    break;
                }
            }
        }

        if (!alguienMojado) {
            System.out.println("¡Nadie se ha mojado! Sigue otra ronda.");
        }
    }
}


