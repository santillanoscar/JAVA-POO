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
    ArrayList<Espectador> listaEspectadores;
    Pelicula p;
    Cine c1;
    
    public void cargarEspectadores() {
        System.out.println("*** Cargar Espectadores ***");
               
        listaEspectadores = new ArrayList(); 
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
        //for (Object listaEspectadore : listaEspectadores) {
          //  System.out.println(listaEspectadore);
        //}
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
        c1 = new Cine();

        String[][] salaCine = new String[8][6];

        System.out.println(" ---------------------------------------- ");
        System.out.println("******* Sala de Cine Vacio *******");
        System.out.println("Referencia: V=Vacio; O=Ocupado");
        System.out.println("");

        for (int i = 7; i >= 0; i--) {
            for (int j = 5; j >= 0; j--) {

                switch (j) {
                    case 5:
                        salaCine[i][j] = (i + 1) + " A " + "V";
                        break;
                    case 4:
                        salaCine[i][j] = (i + 1) + " B " + "V";
                        break;
                    case 3:
                        salaCine[i][j] = (i + 1) + " C " + "V";
                        break;
                    case 2:
                        salaCine[i][j] = (i + 1) + " D " + "V";
                        break;
                    case 1:
                        salaCine[i][j] = (i + 1) + " E " + "V";
                        break;
                    case 0:
                        salaCine[i][j] = (i + 1) + " F " + "V";
                        break;
                    default:
                        System.out.println("error");
                }
                System.out.print("[ " + salaCine[i][j] + " ]");
            }
            System.out.println(" ");
        }
        System.out.println(" ---------------------------------------- ");
        // ***** CARGAR 
        c1.setSalaCine(salaCine);
        c1.setPeli(p);
        System.out.println("Ingrese Precio de la entrada la cine");
        c1.setPrecioEntrada(leer.nextDouble());

    }

    public void ubicarEspectadores() {
      HashSet <Integer> fila = new HashSet();
        HashSet <Integer> columna = new HashSet();
        
        cargarEspectadores();
        //c1 = new Cine();
        String[][] salaCine = new String[8][6];
        int contador = 0;
        for (Espectador aux : listaEspectadores) {
            System.out.println(aux.toString());
            if (aux.getDinero() > c1.getPrecioEntrada()) {
                System.out.println("A la " + aux.getNombre() + " le alcanza el dinero ");
                if (aux.getEdad() > p.getEdadMinima()) {
                    System.out.println(aux.getNombre() + " Tiene la edad permitida");
                    
                    Integer f;
                    Integer c;
                    do {
                        f = (int) (Math.random() * 8);
                        c = (int) (Math.random() * 6);

                        if (!fila.contains(f) && !columna.contains(c)) {
                            System.out.println("fila " + f);
                            System.out.println("columna " + c);
                            fila.add(f);
                            columna.add(c);
                        }
                    } while (!fila.contains(f));

                   
                    
                                     

                    for (int i = 7; i >= 0; i--) {
                        for (int j = 5; j >= 0; j--) {

                            switch (j) {
                                case 5:
                                    if ((i == f) && (j == c)) {
                                        salaCine[i][j] = (i + 1) + "A " + "O";
                                    } 
                                    break;
                                case 4:
                                    if ((i == f) && (j == c)) {
                                        salaCine[i][j] = (i + 1) + "B " + "O";
                                    } 
                                    break;
                                case 3:
                                    if ((i == f) && (j == c)) {
                                        salaCine[i][j] = (i + 1) + "C " + "O";
                                    }
                                    break;
                                case 2:
                                    if ((i == f) && (j == c)) {
                                        salaCine[i][j] = (i + 1) + "D " + "O";
                                    } 
                                    break;
                                case 1:
                                    if ((i == f) && (j == c)) {
                                        salaCine[i][j] = (i + 1) + "E " + "O";
                                    } 
                                    break;
                                case 0:
                                    if ((i == f) && (j == c)) {
                                        salaCine[i][j] = (i + 1) + "F " + "O";
                                    } 
                                    break;
                                default:
                                    System.out.println("error");
                            }
                            System.out.print("[ " + salaCine[i][j] + " ]");
                        }
                        System.out.println(" ");
                    }

                } else {
                    System.out.println("Edad NO Permitida");
                    contador++;
                }
            } else {
                System.out.println("A la " + aux.getNombre() + " NO le alcanza el dinero ");
                contador++;
            }

            System.out.println(" ");

            System.out.println(" ");
        }
        System.out.println("No ingresaron "+contador+" personas");
        
        for (Integer f : fila) {
            System.out.println("filas "+f);
        }
        for (Integer c : columna) {
            System.out.println("columnas "+c);
        }
    }

}
     
     
     
     
     
   
     

    
    
    

