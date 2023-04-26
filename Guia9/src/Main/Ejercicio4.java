/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicios.ServicioEj4Fecha;

public class Ejercicio4 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioEj4Fecha sf = new ServicioEj4Fecha();
        
        
        System.out.println(" La fecha actual del sistema es: "+ sf.fechaActual());
        System.out.println("***");
        System.out.println(" La fecha actual formateda es: "+sf.formatearFecha(sf.fechaActual()));
        System.out.println("***");
        System.out.println("La edad es:"+sf.diferencia(sf.fechaActual(), sf.fechaNacimiento()));
        
       
    }
    
}
