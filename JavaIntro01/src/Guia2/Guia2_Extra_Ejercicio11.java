/*
 Escribir un programa que lea un número entero y devuelva el número de 
dígitos que componen ese número. Por ejemplo, si introducimos el número 
12345, el programa deberá devolver 5. Calcular la cantidad de dígitos 
matemáticamente utilizando el operador de división.
Nota: recordar que las variables de tipo entero truncan los números o resultados
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Extra_Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int contador =0;
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int aux= num;
        while (aux > 0) {
            
            int calculo = aux / 10;
            aux = calculo;
            contador+=1;
        }

        System.out.println("El numero "+num+ " tiene "+contador+" digitos");


    }
    
}
