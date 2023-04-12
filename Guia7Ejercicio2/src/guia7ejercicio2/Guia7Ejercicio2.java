/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio2;

import guia7ejercicio2Entidad.Circunferencia;
import java.util.Scanner;

public class Guia7Ejercicio2 {

    public static void main(String[] args) {
        // TODO code application logic here
                
        //Scanner leer = new Scanner(System.in);
        // System.out.println("Ingrese el radio de la circunferencia ");
        
        Circunferencia circ1 = new Circunferencia();
        
        circ1.crearCircunferencia();
        
        circ1.area();
        circ1.perimetro();
        
        System.out.println("-------- ");
        
        circ1.setRadio(10);
        circ1.area();
        circ1.perimetro();
        
        
        
    }
    
}
