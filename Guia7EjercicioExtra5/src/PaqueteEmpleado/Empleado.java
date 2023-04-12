/*
 Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y 
"salario". Luego, crea un método "calcular_aumento" que calcule el aumento 
salarial de un empleado en función de su edad y salario actual. El aumento 
salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si 
tiene menos de 30 años.

 */
package PaqueteEmpleado;

import java.util.Scanner;

public class Empleado {
    
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    

    public Empleado() {
    }
    
    public void calcularAumento (){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre del empleado");
        this.nombre = leer.next();
        System.out.println("Ingrese salario actual :");
        this.salario = leer.nextDouble();
        System.out.println("Ingrese edad del empleado");
        this.edad = leer.nextInt();
        
        if (edad >= 30) {
            salario = (salario * 1.1);
            System.out.println("El salario de "+nombre+ " tiene un aumento del\n"
                    + "10% por lo que queda en $"+ salario);
        } else {
            salario = (salario * 1.05);
            System.out.println("El salario de "+nombre+ " tiene un aumento del\n"
                    + "5% por lo que queda en $"+ salario);
        }
        
        
        
        
        
    }
    
}
