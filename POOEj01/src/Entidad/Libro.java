/*     
   
   

*/
package Entidad;

import java.util.Scanner;

public class Libro {
    
    public int isbn;
    public String titulo;
    public String autor;
    public int nroPaginas;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int nroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }
 

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
    
    public void mostrarLibro() {
    System.out.println("ISBN del libro: "+isbn);
    System.out.println("Título del libro: "+titulo );
    System.out.println("Autor del libro: "+autor);
    System.out.println("Nro.Páginas del libro: "+nroPaginas);
  
    
    
    
    }    
    
    
}
   