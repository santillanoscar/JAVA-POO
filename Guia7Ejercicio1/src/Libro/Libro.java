/*
 Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
atributos pasados por parámetro y un constructor vacío. Crear un método 
para cargar un libro pidiendo los datos al usuario y luego informar mediante 
otro método el número de ISBN, el título, el autor del libro y el número 
de páginas.
 */
package Libro;

import java.util.Scanner;

public class Libro {
    public int isbn;
    public String titulo;
    public String autor;
    public int nroPaginas;

    //contructor vacio
    public Libro() {
    }
    
    //constructor con todos los parametros
    public Libro(int isbn, String titulo, String autor, int nroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }

    //gets y sets de todos los atributos
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
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

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    //metodo para cargar libros solicitando datos al usuario
    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro");
        isbn = leer.nextInt();
        leer.nextLine(); // Consumir la línea en blanco que queda
        System.out.println("Ingrese el Título del libro");
        titulo = leer.nextLine();
        System.out.println("Ingrese el Autor del libro");
        autor = leer.nextLine();
        System.out.println("Ingrese el Número de Páginas del libro");
        nroPaginas = leer.nextInt();
        leer.nextLine(); // Consumir la línea en blanco que queda

    }
    //metodo para mostrar los libros 
    public void mostrarLibro() {
        System.out.println("ISBN del libro: " + isbn);
        System.out.println("Título del libro: " + titulo);
        System.out.println("Autor del libro: " + autor);
        System.out.println("Nro.Páginas del libro: " + nroPaginas);

    }

}
   

