package Espectador;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). 
* De Cine nos interesa conocer la película que se está reproduciendo, la sala con los espectadores y el precio de la entrada. 
* 
* Luego, de las películas nos interesa saber el título, duración, edad mínima y director. 
* 
* Por último, del espectador, nos interesa saber su nombre, edad y el dinero que tiene disponible.
 * @author Flia. SANTILLAN
 */
public class Espectador {
    
    private String nombre;
    private int edad;
    private double dinero;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + '}';
    }
    
    
}
