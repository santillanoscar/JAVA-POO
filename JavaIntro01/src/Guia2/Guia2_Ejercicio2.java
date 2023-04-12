/*
 *Crear un programa que pida una frase y si esa frase es
igual a “eureka” el programa pondrá un mensaje de Correcto,
sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
               
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        if (frase.equals("eureka")) {
            System.out.println("El mensaje es Correcto");
        }else {
            System.out.println("El mensaje es Incorrecto");
        }
            
        }
   }
