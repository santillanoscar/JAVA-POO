
package Entidad;

import java.util.ArrayList;
import java.util.List;

/**
 *Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 * @author Flia-Santillan
 */
public class Equipo {
    
    
    List <Jugador> listaJugadores = new ArrayList<Jugador>();

    public Equipo() {
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "listaJugadores=" + listaJugadores + '}';
    }

    

    
}
