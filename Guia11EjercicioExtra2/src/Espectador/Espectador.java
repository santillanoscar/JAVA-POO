package Espectador;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). 
* De Cine nos interesa conocer la película que se está reproduciendo, la sala con los espectadores y el precio de la entrada. 
* 
* Luego, de las películas nos interesa saber el título, duración, edad mínima y director. 
* 
* Por último, del espectador, nos interesa saber su nombre, edad y el dinero que tiene disponible.
 * @author Flia. SANTILLAN
 */
public class Espectador {
    
    private String nombre;
    private int edad;
    private double dinero;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + '}';
    }
    
    public void crearEspectadores() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ArrayList <Espectador> listaEspectadores = new ArrayList();
        int cant;
        System.out.println("Ingrese cantidad de espectadores (Max. 48)");
        do {
            
            cant = leer.nextInt();
            if (cant <= 48) {
                for (int i = 0; i < cant; i++) {
                    int edad = (int) (Math.random() * 99 + 1);
                    double dinero = (double) Math.round(Math.random() * 100000 + 1)/100;
                    Espectador e1 = new Espectador("Persona*" + (i + 1), edad, dinero);
                    listaEspectadores.add(e1);
                }
            } else {
                System.out.println("Ingrese una cantidad de espectadores\n"
                        + "entre 1 y 48 por favor");
            }
        } while (cant > 48);
        
        for (Object listaEspectadore : listaEspectadores) {
            System.out.println(listaEspectadore);
        }
        

    }

}
