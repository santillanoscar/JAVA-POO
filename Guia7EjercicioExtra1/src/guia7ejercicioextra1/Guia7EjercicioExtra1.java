
package guia7ejercicioextra1;

import Guia7EjercicioExtra1Entidad.Cancion;


public class Guia7EjercicioExtra1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Cancion canc1 = new Cancion("Circo Beat"," Fito Paez");
        Cancion canc2 = new Cancion();
        
        System.out.println("El titulo de la cancion es: "+canc1.getTitulo());
        System.out.println("El autor de la cancion es: "+canc1.getAutor());        
        
        canc2.cargarCancion();
        canc2.mostrarCancion();
        
    }
    
}
