package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
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
    ArrayList <Alumno> listaAlumnos = new ArrayList<>(); // lista de alumnos
    
    public void cargarAlumno() {
        String opcion;
        String nombre;
        int cont=1;

        do {

            Alumno a1 = new Alumno(); // Objeto alumno
            System.out.println("Ingrese nombre del Alumno:"+cont);
            a1.setNombre(leer.next()); //seteo el nombre al objeto a1.Alumno
            cont+=1;
            ArrayList<Integer> listaNotas = new ArrayList<>(3);
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota N° " + (i + 1));
                listaNotas.add(leer.nextInt()); // se agregan las 3 notas a la listaNotas
            }
            a1.setNotas(listaNotas); //seteo la listaNotas que contiene las 3 notas al objeto alumno
            listaAlumnos.add(a1); // Agrego al Array de Alumnos ( nombre + 3 notas)

            System.out.println("Desea ingresar otro Alumno? (S/N)");
            opcion = leer.next();

        } while (opcion.equalsIgnoreCase("S"));

            System.out.println("***FINAL CARGAR ALUMNO****");
    }

    public void mostrarAlumnoNotas(){
        
        for (Object aux : listaAlumnos) {
            System.out.println(aux);
        }
    }
    
    
    public void notaFinal() {
//    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.
        String opcion2;
        
        do {
            boolean encontrado = false;
            System.out.println("Ingrese Nombre del Alumno que desea calcular su Nota Final:");
            String nomb = leer.next();
            System.out.println("************************************");

            for (Alumno alu : listaAlumnos) {
                if (alu.getNombre().equals(nomb)) {
                    ArrayList<Integer> notas = alu.getNotas();
                    int suma = 0;
                    for (int n : notas) {
                        suma += n;
                    }
                    double promedio = (double) suma / notas.size();
                    System.out.println("La nota final de " + nomb + " es: " + promedio);
                    System.out.println("**********************************************");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró el alumno.");
                System.out.println("****************************");
            }

            System.out.println("***Desea Calcular otro Promedio? (S/N)");
            opcion2 = leer.next();

        } while (opcion2.equalsIgnoreCase("S"));
    }

}