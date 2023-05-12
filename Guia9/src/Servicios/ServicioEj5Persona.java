/*
  Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
//Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la 
persona a crear. Retornar el objeto Persona creado.

Método calcularEdad que calcule la edad del usuario utilizando el atributo 
de fecha de nacimiento y la fecha actual.

Método menorQue recibe como parámetro una Persona y una edad. Retorna true 
si la persona es menor que la edad consultada o false en caso contrario.

Método mostrarPersona que muestra la información de la persona deseada.
 */
package Servicios;

import Entidad.Ej5Persona;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class ServicioEj5Persona {
    Scanner leer = new Scanner(System.in);
    
   

    public Ej5Persona crearPersona() {
        //Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la 
        //persona a crear. Retornar el objeto Persona creado.
        
        System.out.println("Ingrese su nombre:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el dia de su nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de su nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de su nacimiento: ");
        int anio = leer.nextInt();
        Date fechaNac = new Date(anio - 1900, mes - 1, dia);

        return new Ej5Persona(nombre, fechaNac);
    }
    
    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }
    
    public int calcularEdad(Ej5Persona p1) {
        //Método calcularEdad que calcule la edad del usuario utilizando el atributo 
        //de fecha de nacimiento y la fecha actual.
        int edad = fechaActual().getYear() - p1.getFechaNac().getYear();
        if ((fechaActual().getMonth() == p1.getFechaNac().getMonth() && fechaActual().getDate() < p1.getFechaNac().getDate()) || (fechaActual().getMonth() < p1.getFechaNac().getMonth())) {
           edad--; 
        }
        return edad;
    }
    
    public boolean menorQue(Ej5Persona p1 ,int Edad) {
        //Método menorQue recibe como parámetro una Persona y una edad. Retorna true 
        //si la persona es menor que la edad consultada o false en caso contrario.
        //System.out.println("Ingrese la edad a comparar: ");
        //int Edad2 = leer.nextInt();
        if (calcularEdad(p1) <= Edad) {
            return true;
        } else {
            return false;
        }
    }
    
    public void mostrarPersona(Ej5Persona p1){
    //Método mostrarPersona que muestra la información de la persona deseada.
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sdf.format(p1.getFechaNac());
        
        System.out.println(" Nombre : "+p1.getNombre());
        System.out.println(" Fecha de nacimiento: " + fecha);
        System.out.println(" Edad: "+ calcularEdad(p1));
  
    
}
}