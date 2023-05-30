package Pelicula;

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
public class Pelicula {
    
    private String titulo;
    private String director;
    private int duracionEnMinutos;
    private int edadMinima;
    
    

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracionEnMinutos, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Titulo=" + titulo + ", duracionEnMinutos=" + duracionEnMinutos + ", edadMinima=" + edadMinima + ", director=" + director + '}'+"\n";
    }
     /*
    public void creaPelicula(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese Titulo de la Pelicula");
        setTitulo(leer.next());
        System.out.println("Ingrese Duracion de la Pelicula (en minutos)");
        setDuracionEnMinutos(leer.nextInt());
        System.out.println("Ingrese Edad minima permitida");
        setEdadMinima(leer.nextInt());
        System.out.println("Ingrese Director de la Pelicula");
        setDirector(leer.next());
              
    }
    public void mostrarPelicula(){
        System.out.println(toString());
    
    }*/
}
