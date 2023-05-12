package Servicio;

import java.util.Scanner;

/**
 *En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 * @author osantillan
 */
public class ServicioAlumno {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    String opcion;
    public void cargarAlumno(){
        
        do {
         
        System.out.println("Ingrese nombre del Alumno");
        String varNombre = leer.next();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota N° "+(i+1));
            int varNota = leer.nextInt();
         
        }
            System.out.println("Desea ingresar otro Alumno? (S/N)");
            opcion=leer.next();
    
        } while (opcion.equalsIgnoreCase("S"));

    }
    
}
