/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia6_Extra_Ejercicio6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner leer = new Scanner(System.in);
        String[][] matriz = new String[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int numRandom = (int) (Math.random() * 10 + 0);
                String numRandomString = Integer.toString(numRandom);
                matriz[i][j] = numRandomString;
            }
        }
        String palabra = "";
        int fila = (int) (Math.random() * 20 + 0);
        int columna = (int) (Math.random() * 10 + 0);
        int contador = 0;
        for (int k = 0; k < 5; k++) {
            do {
                System.out.println(" Ingrese una palabra " + (k + 1) + " tiene que tener de entre 3 y 5 caracteres");
                palabra = leer.next().toUpperCase();
            } while (palabra.length() < 3 || palabra.length() > 5);
            fila = (int) (Math.random() * 20 + 0);
            columna = (int) (Math.random() * 10 + 0);
            contador = 0;
            for (int i = columna; i < (columna + palabra.length()); i++) {
                matriz[fila][i] = palabra.substring(contador, contador + 1);
                contador++;
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
}