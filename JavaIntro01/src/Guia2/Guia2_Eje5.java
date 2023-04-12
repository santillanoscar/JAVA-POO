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
public class Guia2_Eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        int num;

        for (int i = 0; i < 4; i++) {

            System.out.println("Ingrese el " + i + " numero");
            num = leer.nextInt();
            System.out.println(num);

            for (int j = 0; j == num; j++) {
                System.out.print("*");

            }

        }

    }
}
