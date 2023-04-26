/*
 Crear en el Main dos arreglos. El arreglo A de 50 números reales y el 
arreglo B de 20 números reales. 
En el Main nuevamente: inicializar A, mostrar A, ordenar A, 
inicializar B, mostrar A y B.

 */
package Main;

import Servicios.ServicioEj3Arreglo;
import java.util.Arrays;

public class Ejercicio3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        double [] arregloA = new double [50];
        double [] arregloB = new double [20];
        
        ServicioEj3Arreglo sa = new ServicioEj3Arreglo();
        
        sa.inicializarA(arregloA);
        System.out.println("**********");
        sa.Mostra(arregloA);
        System.out.println("**********");
        sa.Ordenar(arregloA);
        System.out.println("**********");
        sa.inicializarB(arregloB, arregloA);
        
        //En el Main nuevamente: inicializar A, mostrar A, ordenar A, 
        //inicializar B, mostrar A y B.
        
        System.out.println("***INICIALIZAR NUEVAMENTE A***");
        for (int i = 0; i < 50; i++) {
             Arrays.fill(arregloA, i, i+1, (double) (Math.random() * 10 + 1));
             System.out.println("["+arregloA[i]+"]");
        }
        
        System.out.println("***ORDENAR NUEVAMENTE A*****");
        Arrays.sort(arregloA);
        for (int i = 0; i < 50; i++) {
            System.out.println("["+arregloA[i]+"]");
        }
    
        System.out.println("***INICIALIZAR NUEVAMENTE B***");
        for (int i = 0; i < 20; i++) {
             Arrays.fill(arregloB, i, i+1, (double) (Math.random() * 10 + 1));
             System.out.println("["+arregloB[i]+"]");
        }
    }
    
    
}
