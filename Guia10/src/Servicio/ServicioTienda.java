package Servicio;

import Entidad.Tienda;
import java.util.HashMap;
import java.util.Map;
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
public class ServicioTienda {
    
    HashMap <String, Integer> listaProductos = new HashMap();
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public void cargarProducto(){
        String opcion;
        do {
        
        System.out.println("Ingrese nombre del producto:");
        String n = leer.next();
        System.out.println("Ingrese precio: ");
        int precio = leer.nextInt();
        
        listaProductos.put(n, precio);
        
            System.out.println("Desea ingresar mas productos? (S/N)");
            opcion= leer.next();
         } while (opcion.equalsIgnoreCase("S"));
        
    }
    
    public void mostrarProductos() {
        System.out.println("***LISTA DE PRODUCTOS***");
        for (Map.Entry<String, Integer> entry : listaProductos.entrySet()) {
            String nombProducto = entry.getKey();
            Integer precio = entry.getValue();
            
            System.out.println("Producto: " + entry.getKey() + "\n"
                             + "Precio  : " + entry.getValue());
            
        }
        System.out.println("");
    }
    
    public void eliminarProducto(){
    
    
    }

}
