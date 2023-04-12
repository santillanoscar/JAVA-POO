
package guia7ejercicio4;

import guia7ejercicio4Entidad.Rectangulo;

public class Guia7Ejercicio4 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo rectangulo1 = new Rectangulo();
        
        rectangulo1.crearRectangulo();
        rectangulo1.calcularSuperficie();
        rectangulo1.calcularPerimetro();
        rectangulo1.mostrarRectangulo();
        rectangulo1.setBase(10);
        rectangulo1.setAltura(10);
       
        rectangulo1.calcularSuperficie();
        rectangulo1.calcularPerimetro();
        rectangulo1.mostrarRectangulo();
        
        
    }
    
}
