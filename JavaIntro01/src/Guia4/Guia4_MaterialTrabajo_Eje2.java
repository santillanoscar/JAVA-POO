/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia4_MaterialTrabajo_Eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();

        esMultiplo(num1, num2);

    }

    public static void esMultiplo(int var1, int var2) {
        int n1 = var1;
        int n2 = var2;
        
        if (n2 % n1 == 0) {
            System.out.println(n1 + " ES MULTIPLO DE " + n2);
        } else {
            System.out.println(n1 + " NO ES MULTIPLO DE " + n2);

        }
    }
}    
            
    
    
    
    

