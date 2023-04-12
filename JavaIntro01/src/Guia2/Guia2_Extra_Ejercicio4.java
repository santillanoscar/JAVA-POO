/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y 
se muestre su equivalente en romano.

 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Extra_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingres un numero del 1 al 10 ");
        int num = leer.nextInt();

        switch (num) {
            case 1:
                System.out.println(num + " Equivale al valor I en numeros Romanos");
                break;
            case 2:
                System.out.println(num + " Equivale al valor II en numeros Romanos");
                break;
            case 3:
                System.out.println(num + " Equivale al valor III en numeros Romanos");
                break;
            case 4:
                System.out.println(num + " Equivale al valor IV en numeros Romanos");
                break;
            case 5:
                System.out.println(num + " Equivale al valor V en numeros Romanos");
                break;
            case 6:
                System.out.println(num + " Equivale al valor VI en numeros Romanos");
                break;
            case 7:
                System.out.println(num + " Equivale al valor VII en numeros Romanos");
                break;
            case 8:
                System.out.println(num + " Equivale al valor VIII en numeros Romanos");
                break;
            case 9:
                System.out.println(num + " Equivale al valor IX en numeros Romanos");
                break;
            case 10:
                System.out.println(num + " Equivale al valor X en numeros Romanos");
                break;
            default:
                System.out.println(" Opcion incorrecta");
                break;
        }

    }

}
