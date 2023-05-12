
package Main;

import Entidad.Estudiante;
import Servicios.EstudianteServicio;
import java.util.Scanner;

public class Integrador {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        EstudianteServicio es1 = new EstudianteServicio();
        
        Estudiante [] e1 = new Estudiante[5];
        
        int opcion;
        do {
        System.out.println("***MENU DE OPCIONES****\n"
                + "1- Cargar Alumnos y notas\n"
                + "2- Calcular y mostrar Promedio\n"
                + "3- Crear y mostrar lista con Alumnos con nota mayor al promedio\n"
                + "4- Salir \n"
                + "ELIJA UNA OPCION");
                    opcion=leer.nextInt();
        
        switch (opcion) {
            case 1:
                es1.cargarAlumnos(e1);
                break;
            case 2:
                 es1.CalcularMostrar(e1);
                break;
            case 3:
                String [] lista = es1.mayorAPromedio(e1);
                 es1.mostrarNombresMayoresAlPromedio(lista);
                break;
            case 4:
                System.out.println(" Muchas gracias y hasta pronto");
                break;    
            default:
                System.out.println("O~pcion Invalida");
        }
        } while (opcion!=4);
             
         
        
        
            
        
    }
    
}
