/*
 Realizar una clase llamada Cadena, en el paquete de entidades, que tenga 
como atributos una frase (String) y su longitud. Agregar constructor vacío y 
con atributo frase solamente. Agregar getters y setters. El constructor con 
frase como atributo debe setear la longitud de la frase de manera automática.
 */
package Entidad;

public class Ej1Cadena {
    
    private String frase;
    private int longitud;

    public Ej1Cadena() {
    }

    public Ej1Cadena(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = frase.length();
    }
    
    
}
