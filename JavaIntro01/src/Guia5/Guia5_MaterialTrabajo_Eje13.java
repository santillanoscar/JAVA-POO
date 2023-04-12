/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia5_MaterialTrabajo_Eje13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String [] equipo = new String [5];
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Ingrese el nombre en la posicion: "+ i);
            equipo [i] = leer.next();
            
            
        }
        for (int i = 0; i < 5; i++) {
            System.out.println( "nombre en posicion: "+ i +" - "+ equipo[i]);
        }
        
    }
    
}
