/*
 Crea una aplicación que a través de una función nos convierta una 
cantidad de euros introducida por teclado a otra moneda, estas pueden 
ser a dólares, yenes o libras. La función tendrá como parámetros, la 
cantidad de euros y la moneda a convertir que será una cadena, este 
no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia4_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int euro;
        int opcion;
        String moneda = "";
        String seguir = "S";
        

        do {
         
        System.out.println("Ingrese la cantidad de Euros que desea convertir ");
        euro = leer.nextInt();

        System.out.println("A que moneda desea convertir\n 1-Libras\n 2-Dolares\n 3-Yenes ?");
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                moneda = "Libras";
                break;
            case 2:
                moneda = "Dolares";
                break;
            case 3:
                moneda = "Yenes";
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }

        convertir(euro, moneda);
        
         System.out.println("Desea hacer otra conversion (S/N) ");
        seguir = leer.next().toUpperCase();
        
         } while (seguir.equals("S"));
    }

    public static void convertir(int var1, String var2) {
        
        double resultado=0.0;
       
        switch (var2) {
            case "Libras":
                resultado = var1 * 0.86;
                break;
            case "Dolares":
                resultado = var1 * 1.28611;
                break;
            case "Yenes":
                resultado = var1 * 129.852;
                break;

            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        
        
        System.out.println("€ " +var1+" Euros serian " + resultado + " " + var2);
    }

}

