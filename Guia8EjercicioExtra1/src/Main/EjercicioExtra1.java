
package Main;

import PaqueteServicio.RaicesServicio;
import java.util.Scanner;


public class EjercicioExtra1 {

 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opcion=0;
        RaicesServicio rs1 = new RaicesServicio();
        
        System.out.println("Ingrese los valores de los terminos");
        rs1.llenarValores();

        do {
            System.out.println("Seleccione una opcion\n"
                    + "1- Obtener Discriminante\n"
                    + "2- Tiene 2 Raices ? \n"
                    + "3- Tiene 1 Raiz ? \n"
                    + "4- Calcular Raices\n"
                    + "5- Calculr Raiz \n"
                    + "6- Mostrar Resultados\n"
                    + "7- Salir");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("La discriminante es:"+ rs1.getDiscriminante());
                    break;
                case 2:
                    if (rs1.tieneRaices()) {
                        System.out.println("La solucion tiene 2 Raices");
                    }else{
                        System.out.println("La solucion No tiene 2 Raices");
                    }
                    break;
                case 3:
                    if (rs1.tieneRaiz()) {
                        System.out.println("La solucion tiene 1 Raiz");
                    }else{
                        System.out.println("No tiene 1 sola raiz");
                    }
                    break;
                case 4:
                    rs1.obtenerRaices();
                    break;
                case 5:
                    rs1.obtenerRaiz();
                    break;
                case 6:
                    rs1.calcular();
                    break;
                case 7:
                    continue;
                        
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println(" ");
        } while (opcion !=7);
        
        
    }
    
}
