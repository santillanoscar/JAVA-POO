/*/*EJERCICIO 9 MATERIAL DE LECTURA
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int suma= 0;
        int conteo=0;
        boolean salir = false;
        do { 
            System.out.println("Ingrese un numero a sumar: ");
            int num = leer.nextInt();
            conteo+=1;
            
            if  (num == 0)  { 
                System.out.println("Se capturó el numero cero");
                break;
                } else if (num < 0 ) { 
                continue;
                } else if (num > 0 ); {
                         suma+=num;
                
                } if (conteo == 20); {
                salir = true;
               }
                       
                
        } while (salir);
        
         System.out.println("Se ingresaron "+conteo+ " numeros y la suma es "+suma);
        
    }
    
}
