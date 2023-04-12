/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres 
de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y
toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de 
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio 
deberá investigar cómo se utilizan las siguientes funciones de 
Java Substring(), Length(), equals().
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here.
        Scanner leer = new Scanner(System.in);
        String cadena;

        int cadCo = 0;
        int cadIn = 0;

        do {
            System.out.println("Ingrese una cadena de texo de 5 caracteres: ");
            cadena = leer.next();
            cadena = cadena.toUpperCase();
            int Longitud = cadena.length();

            if (Longitud == 5 && cadena.substring(0, 1).equals("X") && cadena.substring(Longitud - 1, Longitud).equals("O")) {
                cadCo += 1;
            } else if (!cadena.equals("&&&&&")) {
                cadIn += 1;
            }
            {
            }
                                
        } while (!cadena.equals("&&&&&"));

        System.out.println("Las cadenas correctas son :" + cadCo);
        System.out.println("Las cadenas incorrectas son :" + cadIn);
        System.out.println("");
    }

}
        

    

