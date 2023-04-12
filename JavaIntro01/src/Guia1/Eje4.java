/*
EJERCICIO 4
Dada una cantidad de grados centígrados se debe mostrar su 
equivalente en grados Fahrenheit. La fórmula correspondiente 
es: F = 32 + (9 * C / 5).

 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int grados ;
        int fahrenheit;
        
        System.out.println("Ingrese la cantidad de grados: ");
        grados = entrada.nextInt();
        fahrenheit = 32 + ((9*grados)/5);
        System.out.println(grados+ " grados es igual a " + fahrenheit + " Fahrenheit" );
        
        
                
        
        
    }
    
}
