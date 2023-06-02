/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioCine;

import Cine.Cine;
import Espectador.Espectador;
import Pelicula.Pelicula;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Flia. SANTILLAN
 */
public class ServicioCine {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ArrayList<Espectador> listaEspectadores = new ArrayList(); 
    Pelicula p;
    Cine c1 = new Cine();
    
    public void cargarEspectadores() {
        System.out.println("*** Cargar Espectadores ***");
                
        System.out.println("Ingrese cantidad de espectadores (Capacidad Max. 48 personas)");
        int cant = leer.nextInt();
            
                for (int i = 0; i < cant; i++) {
                    int edad = (int) (Math.random() * 99 + 1);
                    double dinero = (double) Math.round(Math.random() * 100000 + 1) / 100;
                    Espectador e1 = new Espectador("Persona*" + (i + 1), edad, dinero);
                    listaEspectadores.add(e1);
                }           
    }
    
    public void cargarPelicula() {
        p= new Pelicula();
        System.out.println(" ");
        System.out.println("*** Cargar Pelicula *** ");
            
            System.out.println("Ingrese Titulo de la Pelicula");
            p.setTitulo(leer.next());
            System.out.println("Ingrese Director de la Pelicula");
            p.setDirector(leer.next());
            System.out.println("Ingrese Duracion de la Pelicula (en minutos)");
            p.setDuracionEnMinutos(leer.nextInt());
            System.out.println("Ingrese Edad minima permitida");
            p.setEdadMinima(leer.nextInt());
    }

    public void crearSalaCine() {
        cargarPelicula();
        
        System.out.println(" *** Sala Cine Vacio *** ");
        System.out.println(" ");
        String[][] salaCineAsiento = new String[8][6];
        
        for (int i = 0; i < 8; i++) {
            if (i == 0) {
                System.out.println("  A1- B2- C3- D4- E5- F6");
           }
            for (int j = 0; j < 6; j++) {
                if (j == 0) {
                    System.out.print((i+1) + "");
                }
                salaCineAsiento[i][j] = " -  ";
                System.out.print(salaCineAsiento[i][j]);
            }
            System.out.println(" ");
        }
        
        c1.setPeli(p);
        c1.setSalaCine(salaCineAsiento);
        System.out.println("Ingrese el precio de la entrada al cine");
        c1.setPrecioEntrada(leer.nextDouble());
    }
    
    public void mostrarSalaCine() {
        for (int i = 0; i < 8; i++) {
            if (i == 0) {
                System.out.println("  A1- B2- C3- D4- E5- F6");
            }
            
            for (int j = 0; j < 6; j++) {
                if (j == 0) {
                    System.out.print((i + 1) + "");
                }
                System.out.print(c1.getSalaCine()[i][j]);
            }
            System.out.println(" ");
        }

    }
    
    
    
    public int numAleatorio(int max, int min) {
        int numAl = (int) (Math.random() * (max - min) + min);
        return numAl;
    }
    
    public void ubicarEspectadores() {

        cargarEspectadores();
        int contador = 0;
        int noEdad = 0;
        int noDinero=0;
        System.out.println("*** Ubicacion de Espectadores ***");
        System.out.println("");

        for (Espectador aux : listaEspectadores) {
            if (contador>=48) {
                System.out.println("NO HAY MAS LUGARES DIPONIBLES EN LA SALA");
                System.out.println(" ");
                break;
            }
            if (aux.getEdad() >= p.getEdadMinima()) {
                System.out.println("");
                System.out.println(aux.getNombre() + " tiene " + aux.getEdad() + " años");
                if (aux.getDinero() >= c1.getPrecioEntrada()) {
                    System.out.println(aux.getNombre() + " tiene $" + aux.getDinero());
                    System.out.println(aux.getNombre() + " *** INGRESO PERMITIDO *** ");
                    int f, c;
                    do {
                        f = numAleatorio(8, 0);
                        c = numAleatorio(6, 0);
                        System.out.println("fila " + f);
                        System.out.println("columna " + c);
                    } while ((c1.getSalaCine()[f][c]).equals(" X  "));

                    c1.getSalaCine()[f][c] = " X  ";
                    contador++;
                    System.out.println("Ingresaron hasta ahora " + contador + " personas");

                } else {
                    System.out.println(aux.getNombre() + " No tiene el dinero Suficiente, tiene $" + aux.getDinero());
                    System.out.println(aux.getNombre() + " *** NO PUEDE INGRESAR *** ");
                    noDinero++;
                    System.out.println("");
                }
            } else {
                System.out.println(aux.getNombre() + " No tiene la edad Permitida, tiene " + aux.getEdad() + " años");
                System.out.println(aux.getNombre() + " *** NO PUEDE INGRESAR *** ");
                noEdad++;
                System.out.println("");
            }

            mostrarSalaCine();
            System.out.println("");
        }
        System.out.println(noEdad+" personas No ingresaron por No cumplir la Edad permitida");
        System.out.println(noDinero+" personas no ingresaron por No tener el dinero suficiente");
    }


    
    
}
     
     
     
     
     
   
     

    
    
    

