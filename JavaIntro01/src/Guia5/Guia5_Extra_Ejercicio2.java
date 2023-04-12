/*
Escriba un programa que averigüe si dos vectores de N enteros son 
iguales (la comparación deberá detenerse en cuanto se detecte alguna 
diferencia entre los elementos).

*/
package Guia5;

import java.util.Scanner;


public class Guia5_Extra_Ejercicio2 {

    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner leer = new Scanner(System.in);
        
        int [] vector1 = new int [4];
        int [] vector2 = new int [4];
       boolean esIgual=false;
        for (int i = 0; i < 4; i++) {
            vector1[i] = (int) (Math.random() * 10 + 1);
            vector2[i] = (int) (Math.random() * 10 + 1);

        }
        for (int i = 0; i < 4; i++) {
            System.out.print(vector1[i]);
        }
        System.out.println("");
        
        for (int i = 0; i < 4; i++) {
            System.out.print(vector2[i]);
        }
        System.out.println("");
        
        for (int i = 0; i < 4; i++) {
            if (vector1[i] != vector2[i]) {
                System.out.println("Los vectores no son iguales");
                break;
            }else{
            esIgual=true;
            }
            }
        
        if (esIgual) {
            System.out.println("Los vectores son igulaes");
        }
        
        }

    }
    
    
    
    
    
          
        
        
        
        
    




    




    
   // {}   [i]   
        
       
        
    

        
    
    
