/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioCine;

import Espectador.Espectador;
import Pelicula.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Flia. SANTILLAN
 */
public class ServicioCine {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public void cargarEspectadores() {
        System.out.println("*** Cargar Espectadores ***");
               
        ArrayList<Espectador> listaEspectadores = new ArrayList(); 
        int cant;
        System.out.println("Ingrese cantidad de espectadores (Max. 48)");
        do {

            cant = leer.nextInt();
            if (cant <= 48) {
                for (int i = 0; i < cant; i++) {
                    int edad = (int) (Math.random() * 99 + 1);
                    double dinero = (double) Math.round(Math.random() * 100000 + 1) / 100;
                    Espectador e1 = new Espectador("Persona*" + (i + 1), edad, dinero);
                    listaEspectadores.add(e1);
                }
            } else {
                System.out.println("Ingrese una cantidad de espectadores\n"
                        + "entre 1 y 48 por favor");
            }
        } while (cant > 48);
        // MOSTRAR ESPECTADORES
        for (Object listaEspectadore : listaEspectadores) {
            System.out.println(listaEspectadore);
        }
    }
    
    public void cargarPelicula() {
        System.out.println("*** Cargar Peliculas *** ");
        ArrayList<Pelicula> listaPeliculas = new ArrayList();
        String opcion;
        
        do {
            Pelicula p = new Pelicula();
            System.out.println("Ingrese Titulo de la Pelicula");
            p.setTitulo(leer.next());
            System.out.println("Ingrese Duracion de la Pelicula (en minutos)");
            p.setDuracionEnMinutos(leer.nextInt());
            System.out.println("Ingrese Edad minima permitida");
            p.setEdadMinima(leer.nextInt());
            System.out.println("Ingrese Director de la Pelicula");
            p.setDirector(leer.next());
            
            listaPeliculas.add(p);
            System.out.println("]Desea cargar otra Pelicula? (S/N)");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));
        
        System.out.println("*** Peliculas en Cartel ***");
        System.out.println("");
        System.out.println(listaPeliculas.toString());
        
        
    }

     public void crearSalaCine() {

        String[][] matriz = new String[8][6];
        
         System.out.println(" ---------------------------------------- ");
         System.out.println("******* Sala de Cine *******");
         System.out.println("Referencia: V=Vacio; O=Ocupado");
         System.out.println("");
         String asiento = "V ";

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                
                switch (j) {
                    case 0:
                        matriz[i][j] = (i+1) + "A";
                        break;
                    case 1:
                        matriz[i][j] = (i+1) + "B";
                        break;
                    case 2:
                        matriz[i][j] = (i+1) + "C";
                        break;
                    case 3:
                        matriz[i][j] = (i+1) + "D";
                        break;
                    case 4:
                        matriz[i][j] = (i+1) + "E";
                        break;
                    case 5:
                        matriz[i][j] = (i+1) + "F";
                        break;
                    default:
                        System.out.println("error");
                }
                
                System.out.print("[ "+matriz[i][j] +"-"+ asiento +" ]");
            }
            System.out.println(" ");
        }
         System.out.println(" ---------------------------------------- ");
        
        
         
         
         
         
     }   
    
}
    
    
    

