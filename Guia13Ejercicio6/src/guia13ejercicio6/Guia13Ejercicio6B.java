/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13ejercicio6;

import MioException.MioException;

/**
 *
 * @author Flia-Santillan
 */
public class Guia13Ejercicio6B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MioException{

        System.out.println("*** caso 6 b *** NO se captura la excepcion");

        System.out.println("sentencia_A1");
        System.out.println("sentencia_A2");

        try {

            System.out.println("sentencia_A3");
            System.out.println("sentencia_A4");

        } catch (MioException e) {
            System.out.println("sentencia_A6");
        }
        System.out.println("sentencia_A5");
    }
}
    
    

