/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A 
se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
*/
package Guia5;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia5_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner leer = new Scanner(System.in);
        
        int matriz[][] = new int[4][4];
        int matrizTrans[][] = new int[4][4];

        
        System.out.println(" Matriz");
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                matriz[i][j] = (int) (Math.random() * 10 + 1);

                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
         System.out.println(" Matriz transpuesta ");
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                matrizTrans[i][j] =  matriz[j][i];

                System.out.print("[" + matrizTrans[i][j] + "]");
            }
            System.out.println(" ");
        }
        
        System.out.println("MOSTRAR Matriz CON FOR MEJORADO");
        String aux;
        System.out.println("* Matriz: ");
        for (int [] fila : matriz){
            aux = "";
            for (int elemento : fila) {
                aux += " "+ "["+elemento+"]";
                }
        System.out.println("["+aux+"]");
        }
    }
}



    
   // {}   [i]   
        
       
        
    

        
    
    
