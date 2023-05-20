
package Revolver;

/**
 *Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 * @author Flia. SANTILLAN
 */
public class Revolver {
    
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    Revolver r1 = new Revolver();
    
    public void llenarRevolver(){
    //llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
    //deben ser aleatorios.
        
    r1.setPosicionActual((int) (Math.random() * 6 + 1));
    r1.setPosicionAgua((int) (Math.random() * 6 + 1));
    }
    
    public boolean mojar(){
    //mojar(): devuelve true si la posición del agua coincide con la posición actual
    return (r1.getPosicionActual()==r1.getPosicionAgua());
    }
    
    public void siguienteChorro(){
    //siguienteChorro(): cambia a la siguiente posición del tambor
    
        if (r1.getPosicionActual()==6) {
            r1.setPosicionActual(1);
        } else {
            r1.setPosicionActual(r1.getPosicionActual()+1);
        }
    }
    
}
