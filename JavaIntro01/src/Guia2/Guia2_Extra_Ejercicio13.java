/*
 Crear un programa que dibuje una escalera de números, donde cada 
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. 
Ejemplo: si se ingresa el número 3:
1
12
123

 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Extra_Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la altura de la escalera");
        int num = leer.nextInt();
        
        for (int i = 1; i < num+1; i++) {
           
                  System.out.print(" ");
                  
            for (int j = 0; j < 10; j++) {
                
                 System.out.print(i);
            }
           
      System.out.println(" ");
            
        }
        
        
    }
    
}
