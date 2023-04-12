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
package guia7ejercicio3;

import guia7ejercicio3Entidad.Operacion;

public class Guia7Ejercicio3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Operacion op1 = new Operacion(0, 0);
        
        op1.crearOperacion();
        op1.sumar();
        op1.restar();
        op1.multiplicar();
        op1.division();
        
        System.out.println("op1.getNum1() es : "+op1.getNum1());
        System.out.println("op1.getNum1() es : "+op1.getNum2());
        
        op1.setNum1(100);
        op1.setNum2(2);
        
        System.out.println("-- despues del set-----");
        
         System.out.println("op1.getNum1() es : "+op1.getNum1());
        System.out.println("op1.getNum1() es : "+op1.getNum2());
        
        
     }
    
}
