
/*
Leer la altura de N personas y determinar el promedio de estaturas
que se encuentran por debajo de 1.60 mts. y el promedio de estaturas
en general.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Extra_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a calcular: ");
        double alturageneral = 0;
        double alturaparcial = 0;
        int contador = 0;
        int personas = leer.nextInt();
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura de la persona: ");
            double altura = leer.nextDouble();
            alturageneral += altura;
            
            if (altura < 1.60) {
                alturaparcial += altura;
                contador++;
 }
        }
                System.out.println("Promedio de altura por debajo de 1.60 mts es: " + (alturaparcial / contador));
                System.out.println("El promedio de estaturas en general es: " + (alturageneral / personas));
           
    }
}

