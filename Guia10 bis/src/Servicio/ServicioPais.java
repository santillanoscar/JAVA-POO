package Servicio;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * El programa pedirá un país en un bucle, se guardará el país en el conjunto y
 * después se le preguntará al usuario si quiere guardar otro país o si quiere
 * salir, si decide salir, se mostrará todos los países guardados en el
 * conjunto. (Recordemos hacer los servicios en la clase correspondiente)
 * Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto
 * recordar cómo se ordena un conjunto. Por último, al usuario se le pedirá un
 * país y se recorrerá el conjunto con un Iterator, se buscará el país en el
 * conjunto y si está en el conjunto se eliminará el país que ingresó el usuario
 * y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le
 * informará al usuario.
 *
 *
 * @author osantillan
 */
public class ServicioPais {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    HashSet<Pais> paisSet = new HashSet<>();

    public HashSet<Pais> cargarPais() {

        String opcion;

        do {
            Pais p1 = new Pais();
            System.out.println("Ingrese el nombre de un pais");
            String nombre = leer.next();
            p1.setNombre(nombre);

            paisSet.add(p1);

            System.out.println("Desea agregar otro pais (S/N)");
            opcion = leer.next();

        } while (opcion.equalsIgnoreCase("S"));

        return paisSet;
    }

    public void mostrarPaisSet() {
        System.out.println("**** MOSTRAR CON ITERATOR****");
        Iterator <Pais> it = paisSet.iterator();
        while (it.hasNext()) {
            Pais aux = it.next();
            System.out.println(aux);
            
        }
        System.out.println("**** MOSTRAR CON FORECH****");
        for (Pais p : paisSet) {
            System.out.println(p);
        }
    }

    public void ordenarPais() {

        ArrayList<Pais> paisArrayList = new ArrayList(paisSet);
        paisArrayList.sort(Pais.compararpais);
        
        System.out.println("*** Paises Ordenados**** ");
        for (Pais aux : paisArrayList) {
            
            System.out.println(aux);
            
        }
    } 
 
    public void eliminarPais() {
        /* Por último, al usuario se le pedirá un país y se recorrerá el conjunto 
        con un Iterator, se buscará el país en el conjunto y si está en el 
        conjunto se eliminará el país que ingresó el usuario y se mostrará el
        conjunto. Si el país no se encuentra en el conjunto se le informará
        al usuario.*/

        System.out.println("Ingrese el nombre del pais a eliminar");
        String var = leer.next();
        boolean elimina = false;

        Iterator<Pais> it2 = paisSet.iterator();
        while (it2.hasNext()) {
            Pais aux = it2.next();
            if (var.equals(aux.getNombre())) {
                it2.remove();
                elimina = true;
                System.out.println("El pais "+var+" fue eliminado ");
                System.out.println("--------------------------------");
                break;
            }
            

        }
        if (!elimina) {
            System.out.println("El pais ingresado NO esta en el conjunto");
            System.out.println("------------------------------------------");
        }
        Iterator<Pais> it3 = paisSet.iterator();
        System.out.println("Los paises del conjunto son los siguientes: ");
        while (it3.hasNext()) {
            Pais aux = it3.next();
            System.out.println(aux);
        }
    }

}

    
    
    
    

