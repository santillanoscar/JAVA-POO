/*
EJERCICIO 2
Escribir un programa que pida tu nombre, lo guarde en una 
variable y lo muestre por pantalla.
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner entrada = new Scanner(System.in); 
        String nombre;
        
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
        
        System.out.println("Su nombre es :"+ nombre);
    }
    
}
