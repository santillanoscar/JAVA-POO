/*
 Método cargarAlumnos(): este método le permitirá al usuario ingresar los 
alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar 
esta información en un arreglo e iterar con un bucle, solicitando en cada 
repetición que se ingrese el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los 
atributos al usuario y después se le asignan a sus respectivos atributos
para llenar el objeto Curso. En este método invocamos al método 
cargarAlumnos() para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la 
ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad 
de horas por día, el precio por hora, la cantidad de alumnos y la cantidad 
de días a la semana que se repite el encuentro.

 */
package Servicios;

import Entidad.Ej6Curso;
import java.util.Scanner;

public class ServicioEj6Curso {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     Ej6Curso v1 = new Ej6Curso();
   
    
    public void cargarAlumnos(){
       
     /*Método cargarAlumnos(): este método le permitirá al usuario ingresar los 
alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar 
esta información en un arreglo e iterar con un bucle, solicitando en cada 
repetición que se ingrese el nombre de cada alumno.*/
          
     for (int i = 0; i < 5 ; i++) {
            System.out.println("Ingrese el nombre del alumno "+(i+1));
            String alumno = leer.next();
            v1.getAlumnos()[i]= alumno;
        }     
                
    }

    public Ej6Curso crearCurso() {
        /*Método crearCurso(): el método crear curso, le pide los valores de los 
atributos al usuario y después se le asignan a sus respectivos atributos
para llenar el objeto Curso. En este método invocamos al método 
cargarAlumnos() para asignarle valor al atributo alumnos*/

        System.out.println("Ingrese el nomre del curso: ");
        v1.setNombreCurso(leer.nextLine());

        System.out.println("Ingrese cantidad de horas por dia: ");
        v1.setCantHorasXDia(leer.nextInt());

        System.out.println("Ingrese cantidad de dias por semana: ");
        v1.setCantDiasXSemana(leer.nextInt());

        do {
            System.out.println("Ingrese el turno (M/N): ");
            v1.setTurno(leer.next().toUpperCase());
        } while (!v1.getTurno().equals("M") && !v1.getTurno().equals("N"));

        System.out.println("Ingrese precio de la hora: ");
        v1.setPrecioXHora(leer.nextInt());

        cargarAlumnos();

        return new Ej6Curso();
    }
     
    
    
    
    public int calcularGanancia(Ej6Curso v1) {

        /*Método calcularGananciaSemanal(): este método se encarga de calcular la 
ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad 
de horas por día, el precio por hora, la cantidad de alumnos y la cantidad 
de días a la semana que se repite el encuentro.*/
        
        int ganancia = v1.getCantHorasXDia() * v1.getPrecioXHora() * 5 * v1.getCantDiasXSemana();
        System.out.println("horas por dia: " + v1.getCantHorasXDia() + " precio por hora: " + v1.getPrecioXHora() + " cant. de alumnos: " + 5 + " cant. dias x semana: " + v1.getCantDiasXSemana());

        System.out.println("La ganancia por semana es de $" + ganancia);
        return ganancia;
    }
}

