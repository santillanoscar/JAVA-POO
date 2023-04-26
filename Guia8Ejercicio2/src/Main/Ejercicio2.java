/*
 Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades 
con los atributos capacidadMáxima (la cantidad máxima de café que puede 
contener la cafetera) y cantidadActual (la cantidad actual de café que 
hay en la cafetera). Agregar constructor vacío y con parámetros así como 
setters y getters. 
 */
package Main;

import Servicio.CafeteraServicio;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        CafeteraServicio cafe1 = new CafeteraServicio();

        System.out.println("Llene la cafetera por favor");
        cafe1.llenarCafetera();

        do {
            System.out.println("Que desea realizar, elija opcion\n"
                    + "1- Servir Taza\n"
                    + "2- Vaciar Cafetera\n"
                    + "3- Agregar Cafe\n"
                    + "4- Llena Cafetera\n"
                    + "5- Cantidad Actual\n"
                    + "6- Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cafe1.servirTaza();
                    break;
                case 2:
                    cafe1.vaciarCafetera();
                    break;
                case 3:
                    cafe1.agregarCafe();
                    break;
                case 4:
                    cafe1.llenarCafetera();
                    break;
                case 5:
                    cafe1.mostrarActual();
                    break;    
                case 6:
                    continue;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            System.out.println("");

        } while (opcion != 6);
    }

}
