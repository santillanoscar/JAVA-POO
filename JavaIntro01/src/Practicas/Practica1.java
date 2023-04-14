
package Practicas;

import java.util.Random;
import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {
        // TODO code application logic here
    
        int matriz[][] = new int[5][5]; // Le ponemos la dimension al vector
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j]= (int) (Math.random()*10+0);
            }
        }
        

        for (int[] i : matriz) {
            System.out.println(" ");
            for (int j : i) {

                // Usamos la i para pasar por todos los elementos y mostrarlos
                System.out.print("["+j + "]");

            }

        }System.out.println("");

    }
}



    
    

 
