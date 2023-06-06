package Entidad;

/**
 *Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 * @author Flia. SANTILLAN
 */
public class Caballo extends Animal{

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public void seAlimntade() {
        System.out.print("Soy "+nombre +" (caballo)" );
        super.seAlimntade();
        
    }
    
    
}
