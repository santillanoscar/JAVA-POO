/*
 Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
ingresa el número 3:
1
12
123

 */
package Guia3;

import java.util.Scanner;

public class EjercicioExtra13 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera :");
        int altura = leer.nextInt();
        String aux = "";
        
        for (int i = 1; i <= altura; i++) {
             aux += i;
            System.out.println(aux+" ");
           
            
            
        }
        
        
        
    }
    
}
