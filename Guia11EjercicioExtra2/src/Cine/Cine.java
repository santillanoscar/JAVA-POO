package Cine;

import Pelicula.Pelicula;

/**
 *Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). 
* De Cine nos interesa conocer la película que se está reproduciendo, la sala con los espectadores y 
* el precio de la entrada. 
* * Luego, de las películas nos interesa saber el título, duración, edad mínima y director. 
* * Por último, del espectador, nos interesa saber su nombre, edad y el dinero que tiene disponible.
 * @author Flia. SANTILLAN
 */
public class Cine {
    
    private Pelicula peli;
    private String [][] salaCine;
    private double precioEntrada;
    

    public Cine() {
    }

    public Cine(Pelicula peli, String[][] salaCine, double precioEntrada) {
        this.peli = peli;
        this.salaCine = salaCine;
        this.precioEntrada = precioEntrada;
        
    }

    public Cine(String[][] salaCine) {
        this.salaCine = salaCine;
    }
    

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public String[][] getSalaCine() {
        return salaCine;
    }

    public void setSalaCine(String[][] salaCine) {
        this.salaCine = salaCine;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

   

    @Override
    public String toString() {
        return "Cine{" + "peli=" + peli + ", salaCine=" + salaCine + ", precioEntrada=" + precioEntrada + '}';
    }

    
    
    
    
    
    }
    
    
    
    

    
    


