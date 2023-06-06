package Entidad;

import java.util.Scanner;

/**
 *Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
* 
* Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.

13

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
* 
 * @author Flia. SANTILLAN
 */
public class Electrodomesticos {
    
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Electrodomesticos() {
    }

    public Electrodomesticos(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    public void comprobarConsumoEnergetico(char letra) {
//    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.

       if (Character.compare(letra, 'f') > 0) {
            consumoEnergetico = 'F';
        } else {
            consumoEnergetico = Character.toUpperCase(letra);
        }
    }
    
    public void comprobarColor(String color){
//        Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.
        String[] coloresValidos = {"blanco", "negro", "rojo", "azul", "gris"};
        for (String aux : coloresValidos) {
            if (aux.equalsIgnoreCase(color)) {
                this.color=color.toUpperCase();
                break;
            } else {
                this.color="BLANCO";
            }
        }
    }
        
    public void crearElectrodomestico(){
//   Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000. 
    
        System.out.println("Ingrese precio del producto (minimo $1000): ");
        precio= leer.nextDouble();
        if (precio<1000d) {
            this.precio=1000d;
        } 
        
        
        System.out.println("Ingrese el color del electrodomestico:");
        color=leer.next();
        comprobarColor(color);
        
        
        System.out.println("Ingrese el consumo Energetico (de A a F)");
        consumoEnergetico = leer.next().charAt(0);
        comprobarConsumoEnergetico(consumoEnergetico);
      
        
        System.out.println("Ingrese el peso del electrodomestico");
        peso = leer.nextDouble();
        
       
        
       
      
    }
    
    public void precioFinal(){
//    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
//    LETRA PRECIO
//      A $1000
//      B $800
//      C $600
//      D $500
//      E $300
//      F $100
//      PESO PRECIO
//  Entre 1 y 19 kg $100
//  Entre 20 y 49 kg $500
//  Entre 50 y 79 kg $800
//  Mayor que 80 kg $1000
    
        switch (consumoEnergetico) {
            case 'A':
                   this.precio = precio + 1000d;
                break;
             case 'B':
                   this.precio = precio + 800d;
                break;
             case 'C':
                   this.precio = precio + 600d;
                break; 
             case 'D':
                   this.precio = precio + 500d;
                break;
             case 'E':
                   this.precio = precio + 300d;
                break;
             case 'F':
                   this.precio = precio + 100d;
                break;    
        }
        if (peso < 19d) {
            this.precio = precio + 100d;
        } else if (peso <= 49d) {
            this.precio = precio + 500d;
        } else if (peso <= 79d) {
            this.precio = precio + 800d;
        } else {
            this.precio = precio + 1000d;
        }
    }
        
    @Override
    public String toString() {
        return "Electrodomesticos{" + "precio= $" + precio + ", color= " + color + ", consumoEnergetico= " + consumoEnergetico + ", peso= " + peso +"Kg"+'}';
    }
    
    
}