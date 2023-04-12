/*
 Crea una aplicación que nos pida un número por teclado y con una 
función se lo pasamos por parámetro para que nos indique si es o no 
un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, 
sin embargo, 17 si es primo.

 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia4_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero :");
        int num = leer.nextInt();
                
                      
        if (esPrimo(num)) {
            System.out.println(num + " Es un numero primo");
        } else {
            System.out.println(num + " NO es un numero primo");
        }

       }

        public static boolean esPrimo(int var1) {
    boolean primo;
    int cant = 0;
    
    for (int i = 1; i < var1+1; i++) {
        if (var1 % i == 0) {
            cant+=1;
        }   
    }
    primo = cant <= 2;
    //SOLAMENTE PARA VERIFICAR USO A PROXIMA LINEA
            System.out.println("Su division da cero "+cant+ " veces");
              
    return primo;  
}
  } 
    

