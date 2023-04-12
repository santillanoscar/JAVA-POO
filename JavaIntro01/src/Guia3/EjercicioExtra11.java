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
        int num;
        int contador = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nuemro entero:");
        num = leer.nextInt();

        for (int i = num; i < 0; i++) {
            num = num / 10;
            contador = contador + 1;
        }

        

        System.out.println("El numero ingresado tiene " + contador + " cifras ");

    }

}
