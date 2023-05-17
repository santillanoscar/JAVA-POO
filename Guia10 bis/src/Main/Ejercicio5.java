
package Main;

import Entidad.Pais;
import Servicio.ServicioPais;
import java.util.HashSet;

/**
 *
 * @author osantillan
 */
public class Ejercicio5 {

    
    public static void main(String[] args) {
        
        ServicioPais p = new ServicioPais();

        HashSet <Pais> paises = p.cargarPais();
        
        p.mostrarPaisSet();
        p.ordenarPais();
        p.eliminarPais();
       
    
    }
    
    
    
    
    
}
