/*
Realizar un algoritmo que calcule la suma de todos los elementos de 
un vector de tamaño N, con los valores ingresados por el usuario.

*/
package Guia5;

import java.util.Scanner;


public class Guia5_Extra_Ejercicio1 {

    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner leer = new Scanner(System.in);

        int[] vector = new int[4];
        int suma = 0;

        System.out.println("Ingrese 4 elementos ");
        for (int i = 0; i < 4; i++) {

            vector[i] = leer.nextInt();
            suma = suma + vector[i];
        }
        for (int i = 0; i < 4; i++) {
            System.out.print("["+vector[i]+"]");

        }
        System.out.println("");
        System.out.println("La suma es:" + suma);
    }

}


    




    
   // {}   [i]   
        
       
        
    

        
    
    
