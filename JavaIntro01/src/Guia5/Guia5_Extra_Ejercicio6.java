/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres 
y, a medida que el usuario las va ingresando, construya una “sopa de letras 
para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas 
en orden horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios no
utilizados con un número aleatorio del 0 al 9. Finalmente imprima por 
pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java substring(), Length() y Math.random().

 */
package Guia5;

import java.util.Scanner;


public class Guia5_Extra_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner leer = new Scanner(System.in);

        String matriz[][] = new String[20][20];

        String palabra = "";
        System.out.println("MATRIZ DE 20 X 20 CON VALORES TIPO STRING");
        for (int i = 0; i < 20; i++) { //   FOR PARA LLENAR LA MATRIZ CON NUMEROS TIPO INTEGER
            //System.out.println("");
            for (int j = 0; j < 20; j++) {
                int numRandom = (int) (Math.random() * 10 + 0); // GENERA UN NUMERO INT ALEATORIO
                String numRandomString = Integer.toString(numRandom); // CONVIERTE EL INT EN STRING
                matriz[i][j] = numRandomString;  // ASIGNO A LA MATRIZ EL NUMERO TIPO STRING
                //System.out.print("(" + matriz[i][j] + ")");

            }

        }
        System.out.println("");
        System.out.println("");

        for (int i = 0; i < 5; i++) { // FOR para ingresar laS 5 palabras

            do { // DO para controlar que la palabra tenga entre 3 y 5 caracteres

                System.out.println("Ingrese la palabra "+ (i + 1) + ": debe tener entre 3 y 5 caracteres. Ingrese palabra " );
                palabra = leer.next().toUpperCase(); // ingresa palabra convertida a mayuscula 
                int largoPalabra = palabra.length(); // asignar largo de la palabra a la variable

                int filaRandom = (int) (Math.random() * 19 + 0); //asigna nro random a la variable
                //System.out.println("fila random:" + filaRandom); // SOLO PARA VERIFICAR EL NRO RANDOM, LUEGO BORRAR

                if (palabra.length() >= 3 && palabra.length() <= 5) {

                    for (int j = 0; j < largoPalabra; j++) { // for para ingresar la palabra letra por letra
                        matriz[filaRandom][j] = palabra.substring(j, (j + 1)); // coloca la palabra letra a letra en la fila random
                        //System.out.println(matriz[filaRandom][j]); // SOLO PARA VERIFICAR EL INGRESO, LUEGO BORRAR
                       
                    }

                }

            } while (palabra.length() < 3 || palabra.length() > 5); // para controlar que la palabra tenga entre 3 y 5 caracteres

        }

        for (int i = 0; i < 20; i++) {
            System.out.println("");
            for (int j = 0; j < 20; j++) {
                System.out.print("(" + matriz[i][j] + ")");
            }

        }

        System.out.println("");

    }

}
         
        
    
    

