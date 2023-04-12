/*
EJERCICIO 6 MATERIAL DE LECTURA
 Implementar un programa que le pida dos números enteros al 
usuario y determine si ambos o alguno de ellos es mayor a 25.

 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Ingrese el primer numero: ");
       num1 = leer.nextInt();
       System.out.println("Ingrese el segundo numero: ");
       num2 = leer.nextInt();
       

       if (num1>25 && num2>25 ) {
            System.out.println("Ambos numeros son mayores a 25");
            
           } else if (num1<=25 && num2<=25) {
                System.out.println("Ambos numeros son Menores o igual a 25");
                
               } else if (num1<=25 || num2<=25) {
                   
                  }  if (num1 < num2) {
                   System.out.println("El numero "+ num1 + " es menor que 25");
                   } else {
                      System.out.println("El numero "+num2 + " es menor que 25");
        
        }
                
        
        
                
                
              
              
                      
                       
    }
    
}
