/*
  Crear una clase llamada Operacion que tenga como atributos privados 
numero1 y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y 
los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado 
al main
Método multiplicar(): primero valida que no se haga una multiplicación 
por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le 
informa al usuario el error. Si no, se hace la multiplicación y se devuelve
el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si 
fuera a pasar una división por cero, el método devuelve 0 y se le informa 
al usuario el error se le informa al usuario. Si no, se hace la división y 
se devuelve el resultado al main.
 */
package guia7ejercicio3Entidad;

import java.util.Scanner;

public class Operacion {

    private int num1;
    private int num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero 1");
        num1 = leer.nextInt();
        System.out.println("Ingrese numero 2");
        num2 = leer.nextInt();
    }

    public void sumar() {
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }

    public void restar() {
        int resta = num1 - num2;
        System.out.println("La resta es: " + resta);
    }

    public void multiplicar() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("ERROR..El resultdo da cero");
        }
        int producto = num1 * num2;
        System.out.println("La multiplicacion es: " + producto);
    }

    public void division() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("ERROR..El resultdo da cero");
        } else {
            double division = num1 / num2;
            System.out.println("La division es: " + division);
        }
    }
}
