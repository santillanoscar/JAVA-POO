/*
 
 */
package Main;

import Servicios.ServicioEj2PardeNumeros;

public class Ejercicio2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
       //double n1 = double Math.random()*25+1;
       
        ServicioEj2PardeNumeros spn = new ServicioEj2PardeNumeros();
        
        spn.mostarValores();
        spn.devolverMayor();
        spn.calcularPotencia();
    }
    
}
