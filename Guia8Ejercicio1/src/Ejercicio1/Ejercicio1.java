
package Ejercicio1;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opcion;
        String otraOp;
        boolean salir = false;
        
        CuentaBancariaServicio nc = new CuentaBancariaServicio();
        
        System.out.println("Por favor cree su cuenta :");
        nc.creaCuenta();

        do {

            System.out.println("SELECCIONE OPERACION A REALIZAR:");
            System.out.println("1-Ingresar Dinero\n"
                    + "2-Retirar Dinero\n"
                    + "3-Extraccion Rapida (20%)\n"
                    + "4-Consultar Saldo\n"
                    + "5-Consultar Datos\n"
                    + "6-Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    nc.Ingresar();
                    break;
                case 2:
                    nc.Retirar();
                    break;
                case 3:
                    nc.ExtraccionRapida();
                    break;
                case 4:
                    nc.consultarSaldo();
                    break;
                case 5:
                    nc.ConsultarDatos();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }

            if (opcion != 6) {
                System.out.println("Desea realizar otra operacion? (S/N)");
                otraOp = leer.next().toUpperCase();
                if (otraOp.equals("N")) {
                    salir = true;
                }
            }

        } while (opcion != 6 && salir != true);
    }

}
