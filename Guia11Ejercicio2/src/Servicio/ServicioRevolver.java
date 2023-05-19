
package Servicio;

import Entidad.Revolver;

/**
 *Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
* 
 * @author Flia-Santillan
 */
public class ServicioRevolver {
     Revolver r1 = new Revolver();
 
    public void llenarRevolver(){
        
        r1.setPosicionActual((int) (Math.random() * 6 + 1));
        r1.setPosicionAgua((int) (Math.random() * 6 + 1));
        System.out.println("Posicion Actual "+r1.getPosicionActual());
        System.out.println("Posicion Agua "+r1.getPosicionAgua());
    }

    public boolean mojar(){
    boolean mojar=false;
   
        if (r1.getPosicionActual()==r1.getPosicionAgua()) {
            mojar=true;
        } 
     return mojar;
    }
    
    public void siguientechorro(){
        
        if (r1.getPosicionActual()==6) {
            r1.setPosicionActual(1);
            System.out.println(" *era 6* Posicion Actual siguiente del agua "+r1.getPosicionActual());
        } else {
            r1.setPosicionActual(r1.getPosicionActual()+1);
             System.out.println(" *else* Posicion Actual siguiente del agua "+r1.getPosicionActual());
        } 
       
    }

}
