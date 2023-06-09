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
    
    double radio;
    double diametro;
    
    
    @Override
    public void ingresoDatos() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese el radio del circulo: ");
        radio = leer.nextDouble();
        
        System.out.println("Ingrese el diametro del circulo: ");
        diametro = leer.nextDouble();
    }

    @Override
    public void calcularArea() {
        System.out.println("***********************************");
       double area = CONSTANTE * Math.pow(radio, 2) ;
       System.out.println("El area del circulo es: "+area+"\n");
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("***********************************");
        double perimetro = CONSTANTE * diametro; 
        
        System.out.println("El perimetro del circulo es: "+perimetro+"\n");
    }    

}
