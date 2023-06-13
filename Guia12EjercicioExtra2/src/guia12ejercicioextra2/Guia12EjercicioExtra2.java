
package guia12ejercicioextra2;

import Entidad.Edificio;
import Entidad.EdificiodeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author Flia. SANTILLAN
 */
public class Guia12EjercicioExtra2 {

    public static void main(String[] args) {
        
        ArrayList <Edificio> listaEdificio = new ArrayList<>();
        //EdificiodeOficinas(nroOficinas, cantPersxOficina, nroPisos, double ancho, double alto, double largo)
        EdificiodeOficinas eo1 = new EdificiodeOficinas(2, 5, 4, 10d, 12d, 5d);
        EdificiodeOficinas eo2 = new EdificiodeOficinas(4, 10, 8, 20d, 24d, 10d);
        
        //String nombre, String tipo, double ancho, double alto, double largo)
        Polideportivo p1 = new Polideportivo("River", true, 5d, 6d, 2.5d);
        Polideportivo p2 = new Polideportivo("Boca", false, 6d, 8d, 4d);
        Polideportivo p3 = new Polideportivo("Racing", true, 6d, 8d, 4d);
        listaEdificio.add(eo1);
        listaEdificio.add(eo2);
        listaEdificio.add(p1);
        listaEdificio.add(p2);
         listaEdificio.add(p3);
         
        // **** CALCULAR SUPERFICIE Y VOLUMEN ****
        for (Edificio aux : listaEdificio) {
              if (aux instanceof Polideportivo){
            System.out.println("Superficie del Polideportivo "+ ((Polideportivo) aux).getNombre()+" -> "+ aux.calcularSuperficie());
            System.out.println("Volumen del Polideportivo " + ((Polideportivo) aux).getNombre()+" -> " + aux.calcularVolumen());
            System.out.println("");
              }else{
              System.out.println("Superficie del Edificio de Oficinas: " + aux.calcularSuperficie());
            System.out.println("Volumen del Edificio de Oficinas: " + aux.calcularVolumen());
            System.out.println("");
              }
            
        }
        
        int techado=0;
        int abierto=0;
        
        // **** TECHADOS O NO TECHADOS *****
        for (Edificio aux : listaEdificio) {
            if (aux instanceof Polideportivo) {
                if (((Polideportivo) aux).isTipo()) {
                    techado++;
                } else {
                    abierto++;
                }
            }
        }
            
        System.out.println("Los Polidepotivos Techado son: "+techado);
        System.out.println("Los Polidepotivos Abiertos son: "+abierto+"\n");
         
       // *** CANTIDAD DE PERSONAS ***
        for (Edificio aux : listaEdificio) {
            if (aux instanceof EdificiodeOficinas) {
                ((EdificiodeOficinas) aux).cantPersonas();
            }
        }
    }

    



}
     
  
        
        
        
        
        
    
    

