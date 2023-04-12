/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite");
        int limite = leer.nextInt();
        int suma = 0;
        do {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            suma += num;
        } while (suma <= limite);
        System.out.println("La suma ha superado el valor limite.");
        System.out.println("El valor de la suma es: " + suma);
    }
}

    

