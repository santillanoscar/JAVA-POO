/*
 * Crear un programa que dado un número determine si es par o impar.

 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
               
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero es Par");
            
        }else { 
            System.out.println("El numero es Impar");
     }    
    }
    }
