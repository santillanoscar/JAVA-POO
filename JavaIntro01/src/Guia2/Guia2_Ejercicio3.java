/*
 * Realizar un programa que solo permita introducir solo frases o 
palabras de 8 de largo. Si el usuario ingresa una frase o palabra 
de 8 de largo se deberá de imprimir un mensaje por pantalla que diga
“CORRECTO”, en caso contrario, se deberá  imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        if (frase.length() == 8) {
            System.out.println("CORRECTO");
            
        } else {
            System.out.println("INCORRECTO");
        }
        
    }
    
}
