/*
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle 
un valor diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, 
A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo 
una variable auxiliar.

 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Extra_Ejercicio2 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;
        int aux = 0;

        System.out.println("Valor de A:"+ A);
        System.out.println("Valor de B:"+ B);
        System.out.println("Valor de C:"+ C);
        System.out.println("Valor de D:"+ D);
        
           System.out.println("");
        
        aux = B;
        B = C ;
        C = A ;
        A = D ;
        D = aux;
        
        System.out.println("Valor de A:"+ A);
        System.out.println("Valor de B:"+ B);
        System.out.println("Valor de C:"+ C);
        System.out.println("Valor de D:"+ D);
    }
    
    
}
