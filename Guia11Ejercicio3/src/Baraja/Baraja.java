/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baraja;

import Carta.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author Flia. SANTILLAN
 */
public class Baraja {
    
    private ArrayList<Carta> baraja = new ArrayList();
    private ArrayList<Carta> eliminadas = new ArrayList();
    private int car;
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    
    int [] carta ={1,2,3,4,5,6,7,10,11,12};
    String [] palo = {"Oro","Espada","Basto","Copa"};
    
    public void crearCarta(){
    
        for (String pal : palo) {
            for (int car : carta) {
                Carta c1 = new Carta(car, pal);
                baraja.add(c1);
            }
        }
    }
    
    public void mostrarBaraja(){
        if (baraja.isEmpty()) { // devuelve true en el caso de que el Array es 0
            System.out.println("No hay mas Cartas !!!");
            System.out.println("");
        } else {
            for (Carta aux : baraja) {
                System.out.println(aux);
            }
            System.out.println("");
        }
    }
    
    
    public void barajar(){
        Collections.shuffle(baraja);
        System.out.println("");
    }


    public void siguienteCarta(){
    
//siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
        String opcion;
        //int contador=0;

        do{
            if (baraja.isEmpty()) { // devuelve true en el caso de que el Array es 0
                System.out.println("No hay mas Cartas !!!");
                System.out.println("");
                break;
            }else{
                System.out.println(baraja.get(car)); //muestra la carta siguiente
                eliminadas.add(baraja.get(car)); // adiciona al array Eliminados
                baraja.remove(car); // elimina del Array Baraja
                System.out.println("");
            }          
            
            System.out.println("Desea ver la siguiente carta?(S/N)");
            opcion = leer.next();
        }while (opcion.equalsIgnoreCase("S"));
    }
    
    public void cartasDisponibles(){
    //cartasDisponibles(): indica el número de cartas que aún se puede repartir.
        System.out.println("Le quedan "+baraja.size()+" cartas en la baraja");
        for (Carta aux : baraja) {
            System.out.println(aux);
        }
        System.out.println("");
    }
    
    public void darCartas(){
//    darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.

        System.out.println("Cuantas Cartas desea mostrar?");
        int cantidad=leer.nextInt();
        
        if (cantidad<baraja.size()) {
            for (int i = 0; i < cantidad; i++) {
              
            System.out.println(baraja.get(car));
            eliminadas.add(baraja.get(car));
            baraja.remove(car);
            }
            System.out.println("Quedaron "+baraja.size()+" cartas en la baraja");
            System.out.println("");
            
        } else {
            System.out.println("Las cartas NO alcanzan ");
            System.out.println("Quedan "+ baraja.size()+" cartas");
            System.out.println("");
        }
    }
    
    
    public void cartasMonton(){
    //mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    //indicárselo al usuario
        System.out.println("Las cartas que fueron dadas son: ");
        for (Carta aux : eliminadas) {
            System.out.println(aux);
        }
        System.out.println("Se mostraron "+eliminadas.size()+" cartas");
        System.out.println("");
    }
    
      
}