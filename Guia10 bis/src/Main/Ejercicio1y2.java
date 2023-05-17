/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicio.ServicioPerro;

/**
 *
 * @author osantillan
 */
public class Ejercicio1y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio.ServicioPerro sp = new ServicioPerro();
        
        sp.cargarPerro();
        sp.buscarEliminarPerros();
        
    }
    
}
