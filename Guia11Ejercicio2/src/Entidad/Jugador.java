package Entidad;

/**
 *Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
* 
 * @author Flia-Santillan
 */
public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + " nombre=" + nombre +" " +id+", mojado=" + mojado + '}';
    }

    
    
    public boolean disparo(Revolver r1) {
//        Métodos: disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
        System.out.println("*** metodo disparo ****");

        r1.llenarRevolver();
        
        if (r1.mojar()) {
            System.out.println("El jugador se ha mojado");
            return true;
        } else {
            System.out.println("El jugador NO se ha mojado");
            System.out.println("Pasa al siguiente Jugador");
            r1.siguientechorro();
            return false;
        }
    }
    
    
    
}
