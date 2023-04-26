
package Main;

import Entidad.Fraccion;
import PaqueteServicios.ServicioFraccion;
import java.util.Scanner;

public class EjercicioExtra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ServicioFraccion sf1 = new ServicioFraccion();
        Fraccion f1 = new Fraccion(3, 4, 2, 3);
        Fraccion f2 = new Fraccion();
        int opcion;
/*
        PARA PROBAR LOS OBJETOS CREADOS
        
        sf1.CrearSuma(f1);
        sf1.CrearSuma2(f1);
        sf1.CrearResta(f1);
        sf1.CrearMulti(f1);
        sf1.CrearDivision(f1);
*/
     // MENU DE OPCIONES
        do {
            System.out.println("Seleccione una opcion\n"
                    + "1- Crear 2 Fracciones\n"
                    + "2- Sumar 2 Fracciones \n"
                    + "3- restar 2 Fracciones \n"
                    + "4- Multiplicar 2 Fracciones \n"
                    + "5- Dividir 2 Fracciones \n"
                    + "6- Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    sf1.CrearFracciones(f2);
                    break;
                case 2:
                    sf1.CrearSuma(f2);
                    break;
                case 3:
                    sf1.CrearResta(f2);
                    break;
                case 4:
                    sf1.CrearMulti(f2);
                    break;
                case 5:
                    sf1.CrearDivision(f2);
                    break;
                case 6:
                    continue;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println(" ");
        
        } while (opcion != 6); 
        
    }
    
}
