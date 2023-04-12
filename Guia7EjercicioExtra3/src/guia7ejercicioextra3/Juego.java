/*
 Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a 
dos jugadores jugar un juego de adivinanza de números. El primer jugador 
elige un número y el segundo jugador intenta adivinarlo. El segundo jugador 
tiene un número limitado de intentos y recibe una pista de "más alto" o
"más bajo" después de cada intento. El juego termina cuando el segundo 
jugador adivina el número o se queda sin intentos. Registra el número de 
intentos necesarios para adivinar el número y el número de veces que cada 
jugador ha ganado.

 */
package guia7ejercicioextra3;

import java.util.Scanner;

public class Juego {
    
     int numeroSecreto;
     int numeroArriesgado;

    public Juego() {
    }

    public Juego(int numeroSecreto, int numeroArriesgado) {
        this.numeroSecreto = numeroSecreto;
        this.numeroArriesgado = numeroArriesgado;
    }
    
    public void iniciarJuego ( ) {
        Scanner leer = new Scanner ( System.in);
        int numeroSecreto = (int) (Math.random()* 30 +1) ;
        int contador = 0;
        
        System.out.println("**** Adivina el numero Secreto ****");
        System.out.println("**** tienes 5 oportunidades ****");         
        do {

            System.out.println("Arriesge un nùmero entre 0 y 50");
            // System.out.println(+ numeroSecreto);
            numeroArriesgado = leer.nextInt();
            if (numeroArriesgado > numeroSecreto) {
                System.out.println("El numero secreto es menor");
            } else if (numeroArriesgado < numeroSecreto) {
                System.out.println("El numero secreto es mayor");
            }
            contador++;
            //System.out.println("contador ==  " + contador );

        } while (numeroSecreto != numeroArriesgado && contador <= 4);
        if (numeroSecreto == numeroArriesgado) {
            System.out.println("*** FELICITACIONES, HAS GANADO !!! *** ");
            System.out.println("El numero secreto era el ** " + numeroSecreto+" ** ");
        } else {
            System.out.println("** HAS PERDIDO ** Se te acabaron los intentos");
            System.out.println("El numero secreto era el ** " + numeroSecreto+" ** ");
        }

    
    
}
}
