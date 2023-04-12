/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o procedimiento 
que imprima el vector.


*/
package Guia5;

import java.util.Scanner;


public class Guia5_Extra_Ejercicio3 {

    public static void main(String[] args) {
        // TODO code application logic here
             
        int vector [] = new int [5];
        
        llenarvector(vector);
        mostrarVector(vector);
        }
    
    public static void llenarvector(int[] vector) {
        for (int i = 0; i < 5; i++) {
           vector[i] = (int) (Math.random() * 10 + 1);
        }
        
 }

    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < 5; i++) {
            System.out.print(vector[i]);
           
        }
        System.out.println("");
    }
    

    }

   
    
   // {}   [i]   
        
       
        
    

        
    
    
