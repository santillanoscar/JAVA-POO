package guia11ejercicioinicial1;

import Entidad.Dni;
import Entidad.Persona;

/**
 *Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 * @author Flia-Santillan
 */
public class Guia11EjercicioInicial1 {

    public static void main(String[] args) {
     
        Dni d1 = new Dni('A', 25701531);
        Dni d2 = new Dni('B', 43102183);
        Dni d3 = new Dni('C', 27452289);

        Persona p1 = new Persona("Oscar", "Santillan", d1);
        Persona p2 = new Persona("Juan", "Perez", d2);
        Persona p3 = new Persona("Maria", "Remedios", d3);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

    }
    
}
