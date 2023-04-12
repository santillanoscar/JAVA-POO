/*
 * Elaborar un algoritmo en el cuál se ingrese una letra y se 
detecte si se trata de una vocal. Caso contrario mostrar un mensaje. 
Nota: investigar la función equals() de la clase String.


 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Extra_Ejercicio3 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un caracter: ");
        String letra = leer.nextLine();
        letra = letra.toUpperCase();

        if (letra.equals("A") || letra.equals("E") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
            System.out.println("El caracter "+letra+" es una Vocal");
        } else {
            System.out.println("El caracter "+letra+ " NO es una vocal");
        }

    }

}
