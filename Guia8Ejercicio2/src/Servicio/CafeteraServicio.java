/*
 Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
el tamaño de la taza y simula la acción de servir la taza con la capacidad 
indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, 
se sirve lo que quede. El método le informará al usuario si se llenó o no la 
taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método
lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    Cafetera c1 = new Cafetera();

    public void llenarCafetera() {
        System.out.println("Cual es la capacidad maxima de la cafetera :");
        c1.setCapacidadMaxima(leer.nextInt());

        c1.setCantidadActual(c1.getCapacidadMaxima());
    }

    public void servirTaza() {
        System.out.println("Ingrese el tamaño de la taza vacia");
        int tamTaza = leer.nextInt();
        
        if (c1.getCantidadActual()<=0) {
            System.out.println("La cafetera esta vacia");
            
        } else if (tamTaza > c1.getCantidadActual()) {
            
            System.out.println("La taza se lleno con la cantidad que habia en la cafetera");
            System.out.println("La taza se lleno un " + c1.getCantidadActual() * 100 / tamTaza + " % ");
            c1.setCantidadActual(0);

        } else {
            System.out.println("La taza se lleno por completo");
            c1.setCantidadActual(c1.getCantidadActual() - tamTaza);
        }
         
    }
    public void vaciarCafetera() {
        c1.setCantidadActual(0);
    
    }
    
    public void mostrarActual(){
          System.out.println("La cantidad actual es de "+c1.getCantidadActual());  
     }       
            
    public void agregarCafe() {

        System.out.println("Ingrese la cantidad que desea agregar a la cafetera");
        int cantidad = leer.nextInt();

        if (c1.getCantidadActual() + cantidad >= c1.getCapacidadMaxima()) {
            System.out.println("No se puede agregar esa cantidad\n"
                    + "supera la cantidad maxima permitida");
        } else {
            c1.setCantidadActual(c1.getCantidadActual() + cantidad);
        }

    }
}
