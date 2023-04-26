/*
 Crearemos la clase FechaService, en paquete Servicios, que tenga los
siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar 
el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto 
usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la 
diferencia de años entre una y otra (edad del usuario).
 */
package Servicios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ServicioEj4Fecha {
    Scanner leer = new Scanner(System.in);
    
    
    public Date fechaNacimiento(){
    //Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
    //Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar 
    //el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
        
    System.out.println("Ingrese dia de su nacimiento");
        int dia=leer.nextInt();
        System.out.println("Ingrese mes de su nacimiento");
        int mes=leer.nextInt();
        System.out.println("Ingrese año de su nacimiento");
        int anio=leer.nextInt();
        
        return new Date(anio-1900,mes-1,dia);
                
    }
    
    public Date fechaActual(){
    /*Método fechaActual que cree un objeto fecha con el día actual. Para esto 
usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.*/
        //Date fa = new Date();
      
    return new Date();
    }
    

    public int diferencia(Date d1, Date d2) {
        //Método diferencia que reciba las dos fechas por parámetro y retorna la 
        //diferencia de años entre una y otra (edad del usuario).

        int Edad = d1.getYear() - d2.getYear();
        // (es mismo mes pero Y no llego al dia del cumple todavia) o ( el no llego al mes del Cumple)  
        // si ( mesActual = mesNac Y diaActual < diaNac ) o ( mesActual < mesNac )
        if ((d1.getMonth() == d2.getMonth() && d1.getDate() < d2.getDate()) || (d1.getMonth() < d2.getMonth())) {
            Edad--;
        }
        return Edad;
    }
    
    
    // ESTO ES PARA DAR UN FORMATO A LA FECHA
    public String formatearFecha(Date d1){
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss"); 
    String fechaFormateada = sdf.format(d1);
    return fechaFormateada;
    }
}
