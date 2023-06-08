package Entidad;

import java.util.Scanner;

/**
 *Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, 
* 1-vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
* 
2- Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. 
* 
* 3- En el main se crearán las formas y se mostrará el resultado final.
* 
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
* 
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
* 
 * @author osantillan
 */
public class Circulo implements CalculosForma {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    @Override
    public double calcularArea() {
                      
        System.out.println("Ingrese el radio del circulo: ");
        double radio = leer.nextDouble();
       
        return (PI * Math.pow(radio, 2);)
    }

    @Override
    public void calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet.");
        
        
        
    }    
    
    
    
    
}
