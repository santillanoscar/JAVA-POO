package Entidad;

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
public class Tienda {
    
    private String nombProducto;
    private int precio;
    
    public Tienda() {
    }

    public Tienda(String nombProducto, int precio) {
        this.nombProducto = nombProducto;
        this.precio = precio;
    }

    public String getNombProducto() {
        return nombProducto;
    }

    public void setNombProducto(String nombProducto) {
        this.nombProducto = nombProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tienda{" + "nombProducto=" + nombProducto + ", precio=" + precio + '}';
    }
    
    
    
    
    
}
