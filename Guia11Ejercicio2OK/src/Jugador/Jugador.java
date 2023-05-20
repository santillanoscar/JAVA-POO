/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import Revolver.Revolver;

/**
 *
 * @author Flia-Santillan
 */
public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public boolean disparo(Revolver revolver) {
        System.out.println(nombre + " se apunta con el revolver.");
        System.out.println("¡Click!");
        
        boolean mojado = revolver.mojar();
        
        if (mojado) {
            System.out.println(nombre + " se ha mojado. ¡Perdió!");
            this.mojado = true;
        } else {
            System.out.println(nombre + " se salvó. Siguiente jugador.");
            revolver.siguienteChorro();
        }
        
        return mojado;
    }

    public boolean estaMojado() {
        return mojado;
    }

    @Override
    public String toString() {
        return nombre;
    }
}


