/*Realizar una clase llamada ParDeNumeros que tenga como atributos dos 
números reales con los cuales se realizarán diferentes operaciones 
matemáticas. La clase debe tener un constructor vacío, getters y setters.  
En el constructor vacío se usará el Math.random para generar los dos números.
 */
package Entidad;

public class Ej2PardeNumeros {
    
    private double n1;
    private double n2;

    public Ej2PardeNumeros() {
         n1 = (double) (Math.random() * 10 + 1);
         n2 = (double) (Math.random() * 10 + 1);
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    
}
