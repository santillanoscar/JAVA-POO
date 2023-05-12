
package Main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author osantillan
 */
public class ParaPracticar {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        TreeMap<Integer, String> estudiantes = new TreeMap();

        int documento;
        String nombre;
        String respuesta = "";

        do {
            System.out.println("Ingrese el documento del alumno");
            documento = leer.nextInt();

            System.out.println("Ingrese el nombre del alumno");
            nombre = leer.next();

            estudiantes.put(documento, nombre);

            System.out.println("Quiere ingresar otro alumno ?");
            respuesta = leer.next();

            estudiantes.replace(documento, "Martin", "Lucas");

        } while (respuesta.equalsIgnoreCase("si"));

        for (Map.Entry<Integer, String> entry : estudiantes.entrySet()) {
            System.out.println("documento=" + entry.getKey() + ", nombre=" + entry.getValue());
        }
    }
}