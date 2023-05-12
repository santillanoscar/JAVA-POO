/*
Método juego(): el método juego se encargará de llamar todos los métodos 
previamente mencionados e informará cuando el usuario descubra toda la palabra
o se quede sin intentos. Este método se llamará en el main.

 */
package Servicios;

import Entidad.Ahorcado;
import java.util.Scanner;

public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in); //.useDelimiter("\n");
    Ahorcado a1 = new Ahorcado();
    

    public void crearJuego() {
        /*Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
Con la palabra del usuario, pone la longitud de la palabra, como la longitud 
del vector. Después ingresa la palabra en el vector, letra por letra, quedando 
cada letra de la palabra en un índice del vector. Y también, guarda la cantidad
de jugadas máximas y el valor que ingresó el usuario.*/
        System.out.println("Ingrese la palabra secreta:");
        String palabra = leer.next().toUpperCase();
        System.out.println("Ingrese la cantidad de chances para adivinar la palabra:");
        a1.setCantJugadaMaxima(leer.nextInt());

        int longitudPalabra = palabra.length();
        //System.out.println("Longitud palabra: " + longitudPalabra);

        String[] vectorPalabra = new String[longitudPalabra];

        for (int i = 0; i < longitudPalabra; i++) {
            System.out.println(" ");
            vectorPalabra[i] = palabra.substring(i, i + 1);
            a1.setVectorPalabra(vectorPalabra);
        }

    }

    public void longitud() {

        /*Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
    Nota: buscar como se usa el vector.length.*/
        System.out.println("**************************************************");
        System.out.println("La longitud de la palabra a encontrar es de " + a1.getVectorPalabra().length);
        System.out.println("**************************************************");
    }

    public boolean buscar(String letra) {
        /*Método buscar(letra):  este método recibe una letra dada por el usuario y 
busca si la letra ingresada es parte de la palabra o no. También informará 
si la letra estaba o no.*/
        boolean acerto = false;

        for (int i = 0; i < a1.getVectorPalabra().length; i++) {
            if (letra.equals(a1.getVectorPalabra()[i])) {
                acerto = true;
            }
        }
        if (acerto) {
            System.out.println("1-La letra '" + letra + "' pertenece a la palabra");

        } else {
            System.out.println("2-La letra '" + letra + "' NO pertenece a la palabra");
        }
        return acerto;
    }

    public void encontradas(String letra) {
        /*Método encontradas(letra):  que reciba una letra ingresada por el usuario y 
muestre cuantas letras han sido encontradas y cuántas le faltan. Este método 
además deberá devolver true si la letra estaba y false si la letra no estaba, 
ya que, cada vez que se busque una letra que no esté, se le restará uno a sus
oportunidades.*/
        boolean letraEsta = false;

        if (buscar(letra)) {
            a1.setLetraEncontrada(a1.getLetraEncontrada() + 1);
            
            if (a1.getLetraEncontrada() == a1.getVectorPalabra().length) {
                System.out.println("USTED HA GANADO, ACERTO LA PALABRA");
               a1.setLetraEncontrada(a1.getVectorPalabra().length); 
            }

        } else {
            a1.setCantJugadaMaxima(a1.getCantJugadaMaxima() - 1);
            if (a1.getCantJugadaMaxima() == 0) {
                System.out.println("Ha perdido el juego, se quedo sin oportunidades");
            }
        }
        System.out.println("5-Cantidad de letras (encontradas/faltantes): " + a1.getLetraEncontrada() +"/"+ (a1.getVectorPalabra().length - a1.getLetraEncontrada()));
        //System.out.println("6-Cantidad de letras que faltan " + (a1.getVectorPalabra().length - a1.getLetraEncontrada()));
    }

    public int intentos() {
        //Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
        int intentos = a1.getCantJugadaMaxima();
        System.out.println("Le quedan " + intentos + " intentos");
        return intentos;
    }


    public void juego() { 
//Método juego(): el método juego se encargará de llamar todos los métodos 
//previamente mencionados e informará cuando el usuario descubra toda la palabra 
//o se quede sin intentos. Este método se llamará en el main.

    crearJuego();
    longitud();
        
        do {
            System.out.println("Ingrese una letra a buscar en la palabra:");
            String letra = leer.next().toUpperCase();
            buscar(letra);
            encontradas(letra);
            intentos();
        } while (intentos() > 0 && a1.getLetraEncontrada()!=a1.getVectorPalabra().length);

        
        
        
    
    

}

}