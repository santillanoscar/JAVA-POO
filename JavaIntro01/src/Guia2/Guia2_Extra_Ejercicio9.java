/*
Simular la división usando solamente restas. Dados dos números enteros 
mayores que uno, realizar un algoritmo que calcule el cociente y el 
residuo usando sólo restas. 
Método: Restar el dividendo del divisor hasta obtener un resultado 
menor que el divisor, este resultado es el residuo, y el número de 
restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

*/
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Extra_Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero (dividendo): ");
        int num1 = leer.nextInt();
       System.out.println("Ingrese un numero entero (divisor): ");
        int num2 = leer.nextInt();
        
        int aux = num1;
        
        if (num2 != 0) {
            
            while (aux>=num2) {
                
                aux = aux-num2;
                contador+=1;                
            }
                        
        } else {
             System.out.println("No se puede dividir un numero por cero");
            
        }
       
        System.out.println(num1+" dividido "+num2+ " es :"+contador+ " y el resto es "+aux);
        
    }
}
