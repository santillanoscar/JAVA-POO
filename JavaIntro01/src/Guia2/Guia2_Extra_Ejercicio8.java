/*
 *Escriba un programa que lea números enteros. Si el número es 
múltiplo de cinco debe detener la lectura y mostrar la cantidad 
de números leídos, la cantidad de números pares y la cantidad de 
números impares. Al igual que en el ejercicio anterior los números 
negativos no deben sumarse. 
Nota: recordar el uso de la sentencia break.
*/
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Extra_Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidad=0;
        int pares=0;
        int impares=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Numeros enteros: ");
        int num = leer.nextInt();
           
        while (num%5!=0) {
            if (num>= 0 && num%2 == 0) {
                pares+=1;
            } 
            if (num>= 0 && num%2 != 0) {
                impares+=1;
            } 
            System.out.println("Ingrese Numeros enteros: ");
        num = leer.nextInt();
            cantidad+=1;
        }
        
        
        System.out.println("Se ingresaron "+cantidad+" de numeros");
        System.out.println("Se ingresaron "+pares+" de numeros pares");
        System.out.println("Se ingresaron "+impares+" de numeros impares");
             
        
        
        
    }
}
