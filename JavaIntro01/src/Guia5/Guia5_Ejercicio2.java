/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
y le pida al usuario un número a buscar en el vector. El programa mostrará 
dónde se encuentra el numero y si se encuentra repetido
*/
package Guia5;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia5_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector: ");
        int num = leer.nextInt();
        int contador = 0;

        int vector[] = new int[num];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
            System.out.println("posicion " + i + " valor: " + vector[i]);
        }
        System.out.println("Ingrese numero a buscar en el vector:");
        int buscar = leer.nextInt();

        for (int i = 0; i < vector.length; i++) {
            if (buscar == vector[i]) {
                System.out.println(buscar + " se encuentra en la posicion " + i);
                contador += 1;

            }

        }

        if (contador == 0) {
            System.out.println(buscar + " No se encuentra en el vector");
        }
    }
}
        
    
    
