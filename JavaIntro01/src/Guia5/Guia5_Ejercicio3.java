/*
Recorrer un vector de N enteros contabilizando cuántos números son 
de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/
package Guia5;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia5_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector: ");
        int num = leer.nextInt();

        int vector[] = new int[num];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 99999 + 1);
            System.out.println("Posicion: " + i + " valor: " + vector[i]);

            if (vector[i] < 10) {
                cont1++;

            }
            if (vector[i] > 9 && vector[i] < 100) {
                cont2++;

            }
            if (vector[i] > 99 && vector[i] < 1000) {
                cont3++;

            }
            if (vector[i] > 999 && vector[i] < 10000) {
                cont4++;

            }
            if (vector[i] > 9999 && vector[i] < 100000) {
                cont5++;

            }
        }

        System.out.println(cont1 + " numeros son de 1 digito");
        System.out.println(cont2 + " numeros son de 2 digito");
        System.out.println(cont3 + " numeros son de 3 digito");
        System.out.println(cont4 + " numeros son de 4 digito");
        System.out.println(cont5 + " numeros son de 5 digito");
        
    }
}

        
        
    

    
   // {}   [i]   
        
       
        
    

        
    
    
