/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejercicio2;

import Entidad.Electrodomesticos;
import Entidad.Lavadora;
import Entidad.Televisor;

/**
 *
 * @author Flia. SANTILLAN
 */
public class Guia12Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //      Electrodomesticos e1 = new Electrodomesticos();
        //      e1.crearElectrodomestico();
        //      System.out.println(e1);
        
//        Lavadora lav1 = new Lavadora();
//
//        lav1.crearLavadora();
//
//        System.out.println(lav1);
        
        Televisor t1 = new Televisor();
        
        t1.crearTelevisor();
        
        System.out.println(t1.toString());

    }

}
