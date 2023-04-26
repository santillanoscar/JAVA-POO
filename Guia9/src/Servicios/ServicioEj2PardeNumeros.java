/*Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá
además implementar los siguientes métodos:

Método mostrarValores que muestra cuáles son los dos números guardados.

Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor

Método calcularPotencia para calcular la potencia del mayor valor de la 
clase elevado al menor número. Previamente se deben redondear ambos valores.

Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicios;

import Entidad.Ej2PardeNumeros;


public class ServicioEj2PardeNumeros {
    Ej2PardeNumeros p1 = new Ej2PardeNumeros();
    
    
    public void mostarValores() {
        //Método mostrarValores que muestra cuáles son los dos números guardados.
        System.out.println("El primer numero es: ");
        System.out.println(p1.getN1());
        System.out.println("El segundo numero es: ");
        System.out.println(p1.getN2());
    }

    public void devolverMayor() {
//Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
        if (p1.getN1() > p1.getN2()) {
            System.out.println("El valor mayor es el numero :" + p1.getN1());
        } else {
            System.out.println("El valor mayor es el numero :" + p1.getN2());
        }
    }
    
    public void calcularPotencia() {
        //Método calcularPotencia para calcular la potencia del mayor valor de la 
        //clase elevado al menor número. Previamente se deben redondear ambos valores.
        if (p1.getN1() > p1.getN2()) {
            p1.setN1(Math.round(p1.getN1()));
            p1.setN2(Math.round(p1.getN2()));
            double potencia = Math.pow(p1.getN1(), p1.getN2());
            System.out.println("La potencia es: " + potencia);
        } else {
            p1.setN1(Math.round(p1.getN1()));
            p1.setN2(Math.round(p1.getN2()));
            double potencia = Math.pow(p1.getN2(), p1.getN1());
            System.out.println("La potencia es: " + potencia);
        }
    }
    
    
    
}
