/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio2Entidad;

import java.util.Scanner;

public class Circunferencia {
    
    
    private double radio;

    public Circunferencia(int radio) {
        this.radio = radio;
    }

    public Circunferencia() {
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia()  {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia ");
        radio = leer.nextDouble();
               
     }
    public void area()  {
        
        //double area= 3.14 * (radio * radio) ;
        double area= Math.PI * Math.pow(radio, 2);
        System.out.println("El area es: "+ area);
        System.out.println(" el radio es:"+radio);
    }
    /*
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
    */
    
    public void perimetro()  {
        
        double perimetro = 2 * Math.PI * radio ;
        System.out.println("El perimetro es "+perimetro);
               
    }
    /*
    public double perimetro() {
        return 2 * Math.PI * radio;
    }    
    */
    
    
    
}
    
    
    

