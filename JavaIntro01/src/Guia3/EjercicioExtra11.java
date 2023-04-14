/*
 Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.

 */
package Guia3;

import java.util.Scanner;


public class EjercicioExtra11 {

    public static void main(String[] args) {
        // TODO code application logic here
        long num;
        int contador = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        num = leer.nextLong();

        do {
             num = num / 10;
            contador++;
        } while (num>0);
        

        System.out.println("El numero ingresado tiene " + contador + " cifras ");

    }

}
