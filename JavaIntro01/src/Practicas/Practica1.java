
package Practicas;

import java.util.Random;
import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {
        // TODO code application logic here
    
        int matriz[][] = new int [2][2]; // Le ponemos la dimension al vector
        matriz[0][0] = 5;
        matriz[0][1] = 2;
        matriz[1][0] = 4;
        matriz[1][1] = 6;
        
        for (int[] i: matriz) {
            System.out.println(" ");
            for (int j: i ){

            // Usamos la i para pasar por todos los elementos y mostrarlos
            System.out.print( j + "-");

        }
            
}
        
/*
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

// Recorrer la matriz con el bucle for-each
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
*/
 }
    }



    
    

 
