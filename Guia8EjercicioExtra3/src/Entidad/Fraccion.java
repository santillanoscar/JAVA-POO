/*
 Crear una clase llamada fracción que contenga 4 atributos 
(denominador y numerador de cada fracción). 
 */
package Entidad;

public class Fraccion {
    
    
    private double n1;
    private double n2;
    private double d1;
    private double d2;

    public Fraccion() {
    }

    public Fraccion(double n1, double n2, double d1, double d2) {
        this.n1 = n1;
        this.n2 = n2;
        this.d1 = d1;
        this.d2 = d2;
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

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    
}