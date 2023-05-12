/*
 Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá 
contener como atributos, un vector con la palabra a buscar, la cantidad de 
letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. 
 */
package Entidad;


public class Ahorcado {
    
    
    private String [] vectorPalabra;
    private int letraEncontrada;
    private int cantJugadaMaxima;

    public Ahorcado() {
    }

    public String[] getVectorPalabra() {
        return vectorPalabra;
    }

    public void setVectorPalabra(String[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public int getLetraEncontrada() {
        return letraEncontrada;
    }

    public void setLetraEncontrada(int letraEncontrada) {
        this.letraEncontrada = letraEncontrada;
    }

    public int getCantJugadaMaxima() {
        return cantJugadaMaxima;
    }

    public void setCantJugadaMaxima(int cantJugadaMaxima) {
        this.cantJugadaMaxima = cantJugadaMaxima;
    }

    public Ahorcado(String[] vectorPalabra, int letraEncontrada, int cantJugadaMaxima) {
        this.vectorPalabra = vectorPalabra;
        this.letraEncontrada = letraEncontrada;
        this.cantJugadaMaxima = cantJugadaMaxima;
    }

}
