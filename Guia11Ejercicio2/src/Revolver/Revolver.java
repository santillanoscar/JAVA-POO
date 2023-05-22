package Revolver;

/**
 *Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
* 
 * @author Flia-Santillan
 */
public class Revolver {
    
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
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

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
       // toString(): muestra información del revolver (posición actual y donde está el agua)
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

   //********METODOS**********
   
    public void llenarRevolver(){
        // llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
        //deben ser aleatorios.
        posicionActual=((int) (Math.random() * 6 + 1));
        posicionAgua=((int) (Math.random() * 6 + 1));
        System.out.println("Posicion Actual "+getPosicionActual());
        System.out.println("Posicion Agua "+getPosicionAgua());
        System.out.println("");
    }

    public boolean mojar() {
        //mojar(): devuelve true si la posición del agua coincide con la posición actual
        return posicionActual == posicionAgua;
    }
    
    public void siguientechorro(){
        //siguienteChorro(): cambia a la siguiente posición del tambor
        if (posicionActual==6) {
            posicionActual=1;
        } else {
            posicionActual++;
        } 
    }
    
}
