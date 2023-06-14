
package ServicioHoteles;

import AlojamientoExtrahotelero.Camping;
import AlojamientoExtrahotelero.Residencia;
import Entidad.HotelPadre;
import java.util.ArrayList;

/**
 *
 * @author osantillan
 */
public class ServicioHoteles {
    
    public void todosLosAlojamientos(ArrayList<HotelPadre> listaHoteles) {

        for (HotelPadre aux : listaHoteles) {
            //**     ELEGIR SEGUN PREFERENCIA A MOSRRTAR
//            System.out.println("Nombre : "+aux.getNombre());
//            System.out.println("Direccion: "+aux.getDireccion());
//            System.out.println("Localidad: "+aux.getLocalidad());
//            System.out.println("Gerente: "+aux.getGerente());
            System.out.println(aux.toString());
            System.out.println("****************************");
        }
    }

    public void campigConResto(ArrayList<HotelPadre> listaHoteles) {
        System.out.println(" Camping con Restaurante :");
        for (HotelPadre aux : listaHoteles) {
            if (aux instanceof Camping) {
                if (((Camping) aux).isResto()) {
                    System.out.println(((Camping) aux).toString());

                }
            }
        }
    }
    
    public void campigConDescuentoGremio(ArrayList<HotelPadre> listaHoteles) {
        for (HotelPadre aux : listaHoteles) {
            if (aux instanceof Residencia) {
                if (((Residencia) aux).isDescGremios()) {
                    System.out.println(((Residencia) aux).toString());

                }
            }
        }
    }
    
    
}
