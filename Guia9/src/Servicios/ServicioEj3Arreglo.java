/*
 Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
 */
package Servicios;

import java.util.Arrays;

public class ServicioEj3Arreglo {
    
    public void inicializarA(double [] arregloA){
        
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (double) (Math.random() * 10 + 1);
        }
    }
    
    public void Mostra(double [] arregloA){
        System.out.println("Mostrar A");
        for (int i = 0; i < arregloA.length; i++) {
            System.out.println("["+arregloA[i]+"]");
            
        }
        
    }
    
    public void Ordenar(double [] arregloA){
        System.out.println("Ordenar A");
        Arrays.sort(arregloA);
        for (int i = arregloA.length-1; i > 0 ; i--) {
             System.out.println("["+arregloA[i]+"]");
        }
        
    }
     public void inicializarB(double [] arregloB,double [] arregloA){
         System.out.println("Inicializar y mostrar arreglo B");
        for (int i = 0; i < 10; i++) {
         Arrays.fill(arregloB, i, i+1, arregloA[i]);
         Arrays.fill(arregloB, 10, 20, 0.5);
        }
         for (int i = 0; i < arregloB.length; i++) {
             System.out.println("["+arregloB[i]+"]" ); 
         }
 
         
    }
} 
    
    
    

