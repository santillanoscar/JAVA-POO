package guia11ejercicio2;

import Servicio.ServicioRevolver;

/**
 *
 * @author Flia-Santillan
 */
public class Guia11Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioRevolver sr = new ServicioRevolver();
        
        
        sr.llenarRevolver();
        System.out.println(" Esta mojado 1 ? "+ sr.mojar());
        
        System.out.println("************************");
        sr.siguientechorro();
        System.out.println(" Esta mojado 2 ? "+ sr.mojar());
        System.out.println("*************************");
        sr.siguientechorro();
        System.out.println(" Esta mojado 3 ? "+ sr.mojar());
        
        
    }
    
}
