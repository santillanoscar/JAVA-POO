/*
EJERCICIO 1
 Escribir un programa que pida dos números enteros por 
teclado y calcule la suma de los dos. El programa deberá 
después mostrar el resultado de la suma
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        int num1;
        int num2;
        
        System.out.println("Ingrese el primero numero: ");
        num1=entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2=entrada.nextInt();
        System.out.println("El Resultado de la suma es :"+(num1 + num2));
    }
    
}
