/*
Realizar un programa que llene una matriz de tamaño NxM con valores 
aleatorios y muestre la suma de sus elementos.

*/
package Guia5;

import java.util.Scanner;


public class Guia5_Extra_Ejercicio5 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int suma = 0;

        System.out.println("Ingrese la cantidad de filas");
        int filas = leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        int columnas = leer.nextInt();

        int matriz[][] = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
                suma += matriz[i][j];
            }
        }
        for (int i = 0; i < filas; i++) {
            System.out.println("");
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }

        }
        System.out.println("");
        System.out.println("");
        System.out.println("La suma de los elementos es " + suma);
        System.out.println("");

    }
}
   
    
   // {}   [i]   
        
       
        
    

        
    
    
