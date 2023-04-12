/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
Se deberá definir además dos constructores: uno vacío que inicializa el título
y el autor a cadenas vacías y otro que reciba como parámetros el título y el 
autor de la canción. Se deberán además definir los métodos getters y setters
correspondientes.
*/


package Guia7EjercicioExtra1Entidad;

import java.util.Scanner;

public class Cancion {
    
    public String titulo;
    public String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void cargarCancion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese titulo de la cancion: ");
        String titulo = leer.nextLine();
        this.titulo = titulo;
        System.out.println("Ingrese autor de la cancion: ");
        String autor = leer.nextLine();
        this.autor = autor;
    }
    
    public void mostrarCancion(){
        System.out.println("El titulo de la cancion es: "+titulo);
        System.out.println("El autor de la cancion es: "+autor);
    }
    
    
    
}
