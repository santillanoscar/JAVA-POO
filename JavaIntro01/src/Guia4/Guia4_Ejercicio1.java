/*
 Crea una aplicación que le pida dos números al usuario y este pueda 
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe 
tener una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main. 

 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia4_Ejercicio1 {

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

        System.out.println("Elija una Opcion\n 1-SUMAR\n 2-RESTAR\n 3-MULTIPLICAR\n 4-DIVIDIR");
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                suma(num1, num2);
                break;
            case 2:
                resta(num1, num2);
                break;
            case 3:
                multiplicacion(num1, num2);
                break;
            case 4:
                division(num1, num2);
                break;
            default:
                System.out.println("Opcion Invalida");
        }
    }

    public static void suma(int var1, int var2) {
        System.out.println(var1 + " mas " +var2+ " es :" + (var1 + var2));
    }

    public static void resta(int var1, int var2) {
        System.out.println(var1 + " menos " +var2+ " es :" + (var1 - var2));
    }
    public static void multiplicacion(int var1, int var2) {
        System.out.println(var1 + " X " +var2+ " es :"  + (var1 * var2));
    }
    public static void division(int var1, int var2) {
        if (var2==0 ) {
            System.out.println("No se puede dividir un numero por cero "); 
        } else {
            System.out.println(var1 + " / " +var2+ " es :" + (var1 / var2));
        }
        
    }
}

