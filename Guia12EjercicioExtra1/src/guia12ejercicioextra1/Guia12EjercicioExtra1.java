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
       
        //
        Barco b1 = new Barco(102030, 10, 2023);
        
        //************* VELEROS ***************************
        Velero v1 = new Velero(3, 102031, 20, 2023);
        //**************BARCO A MOTOR  *******************
        BarcoAMotor bam1 = new BarcoAMotor(5, 102032, 30, 2022);
        //****************** YATE  *******************
            Yate y1 = new Yate(2, 5, 102033, 15, 2021);
            
            System.out.println("Bienvenidos a BARCOS LOCOS");
            int opcion=0;
            String alquilar;
            do {
                System.out.println("Seleccione el barco que desea alquilar\n"
                    + "1- Velero\n"
                    + "2- Barco a Motor\n"
                    + "3- Yate de Lujo\n"
                    + "4- SALIR");
            opcion=leer.nextInt();
                
                switch (opcion) {
                    case 1:
                        System.out.println("*** VELERO ***");
                        System.out.println(v1.toString());
                        System.out.println("Desea alquilar esta embarcacion? (S/N)");
                        alquilar=leer.next();
                        if (alquilar.equalsIgnoreCase("s")) {
                            v1.alquiler();
                            System.out.println("MUCHAS GRACIAS POR SU ALQUILER\n");
                        }
                                
                        break;
                    case 2:
                        System.out.println("*** BARCO A MOTOR ***");
                        System.out.println(bam1.toString());
                        System.out.println("Desea alquilar esta embarcacion? (S/N)");
                        alquilar=leer.next();
                        if (alquilar.equalsIgnoreCase("s")) {
                            bam1.alquiler();
                            System.out.println("MUCHAS GRACIAS POR SU ALQUILER\n");
                        }
                                                
                        break;
                    case 3:
                        System.out.println("*** YATE DE LUJO ***");
                        System.out.println(y1.toString());
                        System.out.println("Desea alquilar esta embarcacion? (S/N)");
                        alquilar=leer.next();
                        if (alquilar.equalsIgnoreCase("s")) {
                            y1.alquiler();
                            System.out.println("MUCHAS GRACIAS POR SU ALQUILER\n");
                        }
                        
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
