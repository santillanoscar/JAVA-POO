package guia13ejercicio5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora 
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para 
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el 
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando 
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario 
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe 
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el 
carácter fallido como un intento
* 
 * @author Flia-Santillan
 */
public class Guia13Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int numeroSecreto = numeroAleatorio();
        int numeroArriesgado;
        int intentos = 1;
        boolean adivino = false;

        System.out.println("** ADIVINE EL NUMERO SECRETO ***"+numeroSecreto);
        System.out.println("*** ( entre 1 y 500) ***\n");

        do {
            try {
                System.out.println("Arriesgue un numero :");
                numeroArriesgado = leer.nextInt();
                
                if (numeroArriesgado > 0 && numeroArriesgado < 501) {

                    if (numeroSecreto == numeroArriesgado) {
                        System.out.println("\n*** ADIVINASTE, FELICITACIONES ***");
                        System.out.println("adivinaste en " + intentos + " intentos\n");
                        adivino = true;
                    } else if (numeroSecreto > numeroArriesgado) {
                        System.out.println("*** No adivinaste ***\n"
                                + "El numero es Mayor");
                        intentos++;
                    } else if (numeroSecreto < numeroArriesgado) {
                        System.out.println("*** No adivinaste ***\n"
                                + "El numero es Menor");
                       intentos++;
                    }
                } else {
                    System.out.println("\nNumero fuera de rango\n"
                            + "Ingrese un numero nuevamente entre 1 y 500 por favor");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n**ERROR**, debes ingresar solo numeros entero");
                System.out.println(e.toString());
                System.out.println("fueron " + intentos + " intentos fallidos\n");
                break;
            }
        } while (adivino == false);
    }
        
   public static int numeroAleatorio(){
      Random random = new Random();
      int a = random.nextInt(500)+1;
    return a;
  } 
   
}

