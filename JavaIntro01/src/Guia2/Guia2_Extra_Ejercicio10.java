/*
 Realice un programa para que el usuario adivine el resultado de 
una multiplicación entre dos números generados aleatoriamente entre
0 y 10. El programa debe indicar al usuario si su respuesta es o no 
correcta. En caso que la respuesta sea incorrecta se debe permitir 
al usuario ingresar su respuesta nuevamente. 
Para realizar este ejercicio investigue como utilizar la función 
Math.random() de Java.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Extra_Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //Math.random() * cuantos nros quiero + donde comienza
        int numAle1 = (int) (Math.random() * 10+1);
        int numAle2 = (int) (Math.random() * 10+1);
        int resultado = numAle1 * numAle2;
        int respuesta = 0;

        System.out.println(numAle1+"*"+numAle2);
        
        //System.out.println("Resultado es " + resultado);
        while (respuesta != resultado) {
            System.out.println("Ingrese el numero a adivinar");
            respuesta = leer.nextInt();

            if (respuesta != resultado) {
                System.out.println("Respuesta Incorrecta");
                if (respuesta > resultado) {
                    System.out.println("El resultado es MENOR");
                } else {
                    System.out.println("El resultado es MAYOR");
                }
            }

        }

        System.out.println("Respuesta Correcta");

    }

}
