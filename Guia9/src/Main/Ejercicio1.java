/*
 
 */
package Main;

import Servicios.ServicioEj1Cadena;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ServicioEj1Cadena sc = new ServicioEj1Cadena();
        
        sc.mostrarVocales();
        sc.invertirFrase();
        System.out.println("Ingrese una letra");
        String letra= leer.next();
        sc.vecesRepetido(letra);
        System.out.println("");
        System.out.println("Ingrese otra frase");
        leer.nextLine();
        String fraseMain = leer.nextLine();
        sc.compararLongitud(fraseMain);
        sc.unirFrases(fraseMain);
        System.out.println("Ingrese simbolo para reemplazar la letra 'a' en la frase");
        String letra2=leer.next();
        sc.reemplazar(letra2);
        System.out.println("Ingrese una letra para ver si existe en la frase");
        String letra3 = leer.next();
        if (sc.contiene(letra3)) {
            System.out.println("La frase contiene la letra '" + letra3 + "'");
        } else {
            System.out.println("La frase NO contiene la letra '" + letra3 + "'");
        }
        
        
        
        
     
    }
    
}
