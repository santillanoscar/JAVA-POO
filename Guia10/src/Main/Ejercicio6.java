
package Main;

import Servicio.ServicioTienda;
import java.util.Scanner;

/**
 *Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 * @author Flia-Santillan
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        Servicio.ServicioTienda st = new ServicioTienda();
        int opcion=0;
        
        
        do {
            System.out.println("Seleccione una Opcion del Menu\n"
                    + "1- Cargar Productos\n"
                    + "2- Modificar Productos\n"
                    + "3- Eliminar Productos\n"
                    + "4- Mostrar Productos\n"
                    + "5- Salir");
            opcion=leer.nextInt();
            
            switch (opcion) {
                case 1:
                    st.cargarProducto();
                    break;
                case 2:
                    System.out.println("Modificar Productos");
                    break;
                case 3:
                    System.out.println("Eliminar Productos");
                    break;
                case 4:
                    st.mostrarProductos();
                    break;
                case 5:
                    System.out.println("Muchas gracias !!!");
                    break;    
                default:
                    System.out.println("Opcion Invalida");;
            }
         
        } while (opcion!=5);
        
        
    }
    
}
