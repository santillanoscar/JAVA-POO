package Servicio;

import Entidad.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 * @author osantillan
 */
public class ServicioPerro {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ArrayList<String> perrosArrayList = new ArrayList();
        
    public void cargarPerro() {

        Perro p1 = new Perro();
        int opcion;

        do {

            System.out.println("Ingrese una raza de perro");
            String raza = leer.next();
            p1.setRazaPerro(raza);
            perrosArrayList.add(raza);

            System.out.println("Desea agregar otra raza de Perro? (1-SI/2-NO)");
            opcion = leer.nextInt();
        } while (opcion==1);
        mostrarPerros();
    }
    
    public void mostrarPerros (){
        System.out.println("Las razas de perros del ArrayList son: ");
        for (String aux : perrosArrayList) {
            System.out.println("* "+aux);
            
        }
    }
    
    public void buscarEliminarPerros() {
        
        System.out.println("Ingrese la raza de perro que desea Eliminar");
        String elimina = leer.next();
        boolean noEsta = false;

        Iterator<String> it = perrosArrayList.iterator();

        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(elimina)) {
                it.remove();
                System.out.println("La raza " + elimina + " fue eliminada");
                System.out.println("----------------------------------");
                noEsta = true;
            }
        }

        if (!noEsta) {
            System.out.println("La raza ingresada no esta en el ArrayList ");
            System.out.println("------------------------------------------");
        } else {
            System.out.println("Las razas de perros del ArrayList son: ");
            Collections.sort(perrosArrayList);

            for (String aux : perrosArrayList) {
                System.out.println("*- " + aux);
            }
        }
    }
}
