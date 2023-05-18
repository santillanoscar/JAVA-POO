
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 *En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
* 
 * @author Flia. SANTILLAN
 */
public class ServicioPelicula {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ArrayList <Pelicula> listaPeliculas = new ArrayList<>();
    
    public void cargarPelicula(){
        String opcion;
        do {
         
        Pelicula p1 = new Pelicula(); //SE CREA OBJETO PELICULA
        //SE SETEA LOS PARAMETROS
        System.out.println("Ingrese nombre de la pelicula**");
        p1.setTitulo(leer.next());
        System.out.println("Ingrese nombre del Director: ");
        p1.setDirector(leer.next());
        System.out.println("Ingrese la duracion de la pelicula");
        p1.setDuracion(leer.nextInt());
        
        listaPeliculas.add(p1);//SE AGREGA EL OBJETO PELICULA A LA LSITA DE PELICULAS
        
            System.out.println("Desea agregar otra Pelicula? (S/N)");
            opcion=leer.next();
        
        } while (opcion.equalsIgnoreCase("S"));
    }
    
    public void mostrarPeliculas(){
        System.out.println("** Peliculas***");
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
        System.out.println("");
    }
    
    public void mostrarPeliculaMayor2(){
        System.out.println("** Peliculas duracion mayor 2 horas **");
        for (Pelicula aux : listaPeliculas) {
            if (aux.getDuracion()>2) {
                System.out.println(aux);
            } 
        }
        System.out.println("");
    }
    //*****************************************************************************
    //METODO PARA ORDENAR LAS PELICULAS POR DURACION DE MANERA ASCENDENTE
    public static Comparator <Pelicula> compararDuracionAs = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return Integer.compare(t.getDuracion(), t1.getDuracion());
        }
    };
    
    public void OrdenaPeliculaDuracionAs(){
          
       
        System.out.println("***Peliculas ordenadas por Duracion ASCENDENTE");
       
        Collections.sort(listaPeliculas, compararDuracionAs);
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
        System.out.println("");
    }
    //*****************************************************************************
    
    //METODO PARA ORDENAR LAS PELICULAS POR DURACION DE MANERA DESCENDENTE
    public static Comparator <Pelicula> compararDuracionDes = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return Integer.compare(t1.getDuracion(), t.getDuracion());
        }
    };
    
    public void OrdenaPeliculaDuracionDes(){
        System.out.println("***Peliculas ordenadas por Duracion DESCENDENTE");
       
        Collections.sort(listaPeliculas, compararDuracionDes);
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
        System.out.println("");
    }
    //*****************************************************************************
    //METODO PARA ORDENAR LAS PELICULAS POR TITULO DE MANERA ASCENDENTE
    public static Comparator <Pelicula> compararTituloAs = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
   
    public void OrdenaPeliculaTituloAs(){
        System.out.println("***Peliculas ordenadas por Titulo ASCENDENTE");
       
        Collections.sort(listaPeliculas, compararTituloAs);
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
        System.out.println("");
    }
    //*****************************************************************************
    //METODO PARA ORDENAR LAS PELICULAS POR DIRECTOR DE MANERA ASCENDENTE
    public static Comparator <Pelicula> compararDirectorAs = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           //return t.getTitulo().compareTo(t1.getTitulo());
           return t.getDirector().compareTo(t1.getDirector());
        }
    };
   
    public void OrdenaPeliculaDirectorAs(){
        System.out.println("***Peliculas ordenadas por Director ASCENDENTE");
       
        Collections.sort(listaPeliculas, compararDirectorAs);
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
        System.out.println("");
    }
}
