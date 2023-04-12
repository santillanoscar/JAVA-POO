/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima 
los datos de las personas ingresadas por teclado e indique si son mayores 
o menores de edad. Después de cada persona, el programa debe preguntarle 
al usuario si quiere seguir mostrando personas y frenar cuando el usuario 
ingrese la palabra “No”.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia4_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String opcion;
        do {
            
       
        
        System.out.println("Ingrese nombre de la persona");
        String nombre = leer.next();
         System.out.println("Ingrese edad de la persona");
        int edad = leer.nextInt();
        
        mostrarPersonas(nombre, edad);
        
            System.out.println("Desea seguir ingresando nombres (S/N)");
            opcion = leer.next().toUpperCase();
               
            
            } while (opcion.equals("S"));     
                
        
    }

    public static void mostrarPersonas(String var1, int var2) {
        
        System.out.println("El nombre es :"+var1);
        System.out.println("La edad de "+var1+" es "+ var2);
        if (var2 >=18) {
            System.out.println(" ES MAYOR DE EDAD");
        } else {
            System.out.println(" NO ES MAYOR DE EDAD");
        }
        
        
        } 
}


