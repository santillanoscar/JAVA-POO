/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicio.ServicioPelicula;

/**
 *
 * @author Flia. SANTILLAN
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Servicio.ServicioPelicula sp = new ServicioPelicula();
        
        sp.cargarPelicula();
        sp.mostrarPeliculas();
        sp.mostrarPeliculaMayor2();
        sp.OrdenaPeliculaDuracionAs();
        sp.OrdenaPeliculaDuracionDes();
        sp.OrdenaPeliculaTituloAs();
        sp.OrdenaPeliculaDirectorAs();
        
        
    }
    
}
