/*
Escribir un programa que procese una secuencia de caracteres ingresada por 
teclado y terminada en punto, y luego codifique la palabra o frase ingresada
de la siguiente manera: cada vocal se reemplaza por el carácter que se indica
en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas)
se mantienen sin cambios.
a
e
i
o
u
@
#
$
%
*
Realice un subprograma que reciba una secuencia de caracteres y retorne 
la codificación correspondiente. Utilice la estructura “según” para la 
transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia4_MaterialTrabajo_Eje1 {

 
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();

        String convertida = convertir(frase);

        System.out.println("La frase convertida guardada en una variable:\n" + convertida);
        System.out.println("La frase convertida llamando a la funcion directamente:\n" + convertir(frase));

    }

    public static String convertir(String var1) {

        String reemplazo = "";
        String aux = "";
        int largoFrase = var1.length();

        for (int i = 0; i < largoFrase; i++) {
            aux = var1.substring(i, i + 1);

            switch (aux) {
                case "a":
                    reemplazo = reemplazo + "@";
                    break;
                case "e":
                    reemplazo = reemplazo + "#";
                    break;
                case "i":
                    reemplazo = reemplazo + "$";
                    break;
                case "o":
                    reemplazo = reemplazo + "%";
                    break;
                case "u":
                    reemplazo = reemplazo + "*";
                    break;
                case ".":
                    i = largoFrase;
                    break;
                default:
                    reemplazo = reemplazo + aux;
            }

        }
        return reemplazo;
    }
}

