/*
 Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
van a ser nombre y nota (representando la nota obtenida en el final). 
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 
estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo 
de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las dos 
tareas que nos ha pedido la escuela.
Calcular y mostrar el promedio de notas de todo el curso
Retornar otro arreglo con los nombre de los alumnos que recibieron una nota 
mayor al promedio del curso
Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];

 */
package Servicios;

import Entidad.Estudiante;
import java.util.Scanner;

public class EstudianteServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
    public void cargarAlumnos(Estudiante[] Alumnos) {
        System.out.println("***** Cargar Alumnos ******");
        String nombre;
        int nota;
        for (int i = 0; i < Alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            nombre = leer.next();
            System.out.println("Ingrese la nota del alumno " + (i + 1));
            nota = leer.nextInt();

            Alumnos[i] = new Estudiante();
            Alumnos[i].setNombre(nombre);
            Alumnos[i].setNota(nota);
        }
        System.out.println("------------------------");
    }
    
    public void CalcularMostrar (Estudiante[] Alumnos){ 
        System.out.println("***** Calcular promedio ******");
    //Calcular y mostrar el promedio de notas de todo el curso
    
        int sumaNota=0;
        
        for (int i = 0; i < Alumnos.length; i++) {
            sumaNota=Alumnos[i].getNota()+sumaNota;
        }
        System.out.println("La suma de las notas es: "+sumaNota);
        System.out.println("La cantidad de alumnos es: "+Alumnos.length);
        System.out.println("El promedio de notas es:" + sumaNota/Alumnos.length);
        
        System.out.println("-------------------------");
    }
    
    public String [] mayorAPromedio(Estudiante [] Alumnos){
    //Retornar otro arreglo con los nombre de los alumnos que recibieron una nota 
    //mayor al promedio del curso
    
    int sumaNotas=0;
    int promedio;
    int contador=0;
    for (Estudiante al : Alumnos ){
        sumaNotas += al.getNota();
    }
    promedio= sumaNotas/Alumnos.length;
    
    for (Estudiante al : Alumnos){
        if (al.getNota()>=promedio) {
            contador++; // para obtener el tamaño del array con alumnos con nota > al promedio
        }
        System.out.println("");
    }
       
    String [] nombresMayoresAlPromedio = new String [contador]; 
    
    for ( int i = 0; i < contador-1; i++){
        if (Alumnos[i].getNota()>=promedio) {
            nombresMayoresAlPromedio[i]=Alumnos[i].getNombre();
        }
    }
    return nombresMayoresAlPromedio;
    }
    
    public void mostrarNombresMayoresAlPromedio(String [] nombresMayoresAlPromedio){
    //Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
        System.out.println("*****Alumnos con notas mayores al promedio******");
        for (String nombre : nombresMayoresAlPromedio) {
            System.out.println("Nombre: "+ nombre);
        }
        System.out.println("---------------------------------------");
    
    }
}
