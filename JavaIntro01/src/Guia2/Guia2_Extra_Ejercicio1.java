/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe 
calcular su equivalente: 1 día, 2 horas.

 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Extra_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        int hora;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de minutos a calcular:" );
        int min = leer.nextInt();
        
        dia = min/1440;
        
        hora = (min % 1440)/60 ;
        
        System.out.println(min+ " minutos corresponde a: "+dia+" dias " +hora+" horas ");
         
    }
    
}
