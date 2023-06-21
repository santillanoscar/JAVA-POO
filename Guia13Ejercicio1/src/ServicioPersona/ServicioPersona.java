/*
 En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los 
atributos al usuario y después se le asignan a sus respectivos atributos 
para llenar el objeto Persona. Además, comprueba que el sexo introducido 
sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un 
mensaje

Método calcularIMC(): calculara si la persona está en su peso ideal (peso 
en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor 
que 20, significa que la persona está por debajo de su peso ideal y la 
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 
25 (incluidos), significa que la persona está en su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor 
que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.

 */
package ServicioPersona;

import Entidad.Persona;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in);
    Persona p1 = new Persona();
 
    public boolean esMayor(Persona p1) {
        return (p1.getEdad() > 17);
    }

    public Persona crearPersona() {
        System.out.println("Ingrese nombre de la persona: ");
        String nombre = leer.next();
        System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();
        String sexo;

        System.out.println("Ingrese el sexo (M/F/O): ");
        do {
            sexo = leer.next().toUpperCase();
            if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("O")) {
                System.out.println("Incorrecto!!!");
                System.out.println("Ingrese sexo nuevamente");
            }
        } while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("O"));

        System.out.println("Ingrese el peso en Kg");
        double peso = leer.nextDouble();
        System.out.println("ingrese la altura en cm");
        double altura = leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }
     
}
        
        
   
  

