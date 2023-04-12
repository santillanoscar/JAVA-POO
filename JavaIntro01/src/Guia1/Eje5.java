/*
    EJERCICIO 5
Escribir un programa que lea un número entero por teclado y 
muestre por pantalla el doble, el triple y la raíz cuadrada de 
ese número. 
Nota: investigar la función Math.sqrt().

 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Eje5 {

    
    public static void main(String[] args) {
        // TODO code application logic here
       
            
        
        Scanner leer     = new Scanner(System.in);
        int num ;
        
        System.out.println("Ingrese un numero entero :");
        num = leer.nextInt();
        System.out.println("El doble de "+num + " es " + (num*2));
        System.out.println("El triple de "+num +" es "+ (num*3));
        System.out.println("La raiz cuadrada de "+ num + " es " + Math.sqrt(num));
        System.out.println("potencia de "+num+" a la 2 es " +  Math.pow(num,2));
        System.out.println("El numero anterior de "+ num + " es " + Math.decrementExact(num));
        System.out.println("El numero posterior de "+ num + " es " + Math.incrementExact(num));
        
        
     
        
        
    }
    
}
