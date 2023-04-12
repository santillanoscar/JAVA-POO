/*
EJERCICIO 3
Escribir un programa que pida una frase y la muestre toda en 
mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.

 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner entrada = new Scanner(System.in); 
        String frase;
        
        System.out.println("Ingrese una frase: ");
        frase = entrada.nextLine();
        
        System.out.println("Su frase en minusculas es :"+ frase.toLowerCase());
        System.out.println("Su frase en mayusculas es :"+ frase.toUpperCase());
        
    }
    
}
