/*
 Realizar un programa que complete un vector con los N primeros números de la 
sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de
los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por 
ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función
que reciba como parámetro el valor de “n” y que calcule la serie hasta llegar 
a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente 
link: https://quantdare.com/numeros-de-fibonacci/

 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia5_Extra_Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad números de la \n" +
"sucesión de Fibonacci");
        int num = leer.nextInt();
        
        int a = 1;
        int b = 0;
        int c;
        int vector[] = new int[num];
        for (int i = 0; i < num; i++) {
            vector[i] = a;
            c = a + b;
            b = a;
            a = c;
            
            switch (i) {
                case 0:
                    System.out.println((i + ") " + (a)));
                    break;
                case 1:
                    System.out.println((i + ") " + (a-1)+ "   "+(a-1)));
                    break;  
                                    
                default:
               System.out.print(i + ") " + (b) + " + " + (a) + " = " + (a + b));
                 break; 
            }
             System.out.println("");         
            
        }
        System.out.println("");
    }
}

    

