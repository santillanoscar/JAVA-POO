/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejercicioextra1;

import Entidad.Barco;
import Entidad.BarcoAMotor;
import Entidad.Velero;
import Entidad.Yate;
import java.util.Scanner;

/**
 *
 * @author Flia. SANTILLAN
 */
public class Guia12EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Barco b1 = new Barco(102030, 10, 2023);
        
       // b1.alquiler();
       //************* VELEROS ***************************
        Velero v1 = new Velero(3, 102031, 20, 2023);
        
        
        
        //**************BARCO A MOTOR  *******************
        BarcoAMotor bam1 = new BarcoAMotor(100, 102032, 30, 2022);
        

        //****************** YATE  *******************
            Yate y1 = new Yate(2, 500, 102033, 15, 2021);
            

        
            
            System.out.println("Bienvenidos a BARCOS LOCOS");
            int opcion=0;
            
            do {
                System.out.println("Seleccione el barco que desea alquilar\n"
                    + "1- Velero\n"
                    + "2- Barco a Motor\n"
                    + "3- Yate de Lujo\n"
                    + "4- SALIR");
            opcion=leer.nextInt();
                
                switch (opcion) {
                    case 1:
                        
                        b1.toString();
                        
                        v1.toString();
                        bam1.toString();
                        y1.toString();
                                
                        break;
                    case 2:
                        bam1.toString();
                        System.out.println("barco a motor");
                        break;
                    case 3:
                        y1.toString();
                        System.out.println("yate lujo");
                        break;
                    case 4:
                        System.out.println("GRACIAS !!! ");
                        break;    
                    default:
                        System.out.println("ERROR!!!");
                        System.out.println("Ingrese una opcion valida");
                        break;
                         
                }
               
        } while (opcion!=4);
        
            
            
            

    }
    
}
