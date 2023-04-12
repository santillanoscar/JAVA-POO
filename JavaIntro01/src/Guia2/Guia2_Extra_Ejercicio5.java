/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos 
sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y 
luego un valor real que represente el costo del tratamiento (previo al 
descuento) y determine el importe en efectivo a pagar por dicho socio.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Extra_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        String socio;
        double valor;
        double tratamiento;
        
        System.out.println("Elija tipo de socio");
        System.out.println("Socio tipo 'A'");
        System.out.println("Socio tipo 'B'");
        System.out.println("Socio tipo 'C'");
        
        socio = leer.next();
        
        switch (socio) {
            case "A":
                System.out.println("Ingrese costo del tratamiento: ");
                valor = leer.nextDouble();
                tratamiento = valor*0.5;
                System.out.println("El costo del tratamiento con 50% descuento es: $"+tratamiento);
                break;
            case "B":
                System.out.println("Ingrese costo del tratamiento: ");
                valor = leer.nextDouble();
                tratamiento = valor*0.65;
                System.out.println("El costo del tratamiento con 35% descuento es: $"+tratamiento);
                break;
            case "C":
                System.out.println("Ingrese costo del tratamiento: ");
                valor = leer.nextDouble();
                tratamiento = valor;
                System.out.println("El costo del tratamiento es: $"+tratamiento);
                break;    
            default:
                System.out.println("Opcion Incorrecta");
                break;
        }
        

        }

    }


