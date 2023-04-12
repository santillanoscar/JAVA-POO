/*
 Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
*/
package Guia5;

/**
 *
 * @author osantillan
 */
public class Guia5_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int vector [] = new int[100];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=i;
        }
        
        for (int i = 99; i >= 0 ; i--) {
            System.out.println("posicion "+i+ " valor: "+vector[i]);
        }
        
        
    }
    
}
