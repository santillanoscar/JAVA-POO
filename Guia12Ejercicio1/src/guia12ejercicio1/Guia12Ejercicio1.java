package guia12ejercicio1;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 * @author Flia. SANTILLAN
 */
public class Guia12Ejercicio1 {

    public static void main(String[] args) {

        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberman");
        perro1.seAlimntade();

        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.seAlimntade();

        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato1.seAlimntade();

        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.seAlimntade();
    }

}
