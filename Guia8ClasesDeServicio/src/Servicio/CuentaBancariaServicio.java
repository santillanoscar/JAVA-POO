/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le 
sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le 
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero 
a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. 
Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
*/
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in);
    CuentaBancaria cb1 = new CuentaBancaria();
    
    public void creaCuenta() {
        
        System.out.println("Ingrese numero de la cuenta bancaria:");
        cb1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese DNI del titular de la cuenta:");
        cb1.setDniCliente(leer.nextLong());
        System.out.println("Ingrese el saldo actual de la cuenta:");
        cb1.setSaldoActual(leer.nextDouble());
       }
    
    public void Ingresar() {
        double ingreso;
        System.out.println("Digite el dinero que quiere ingresar a la cuenta:");
        ingreso = leer.nextDouble();
        cb1.setSaldoActual(cb1.getSaldoActual()+ingreso);
        
    }
    
    public void Retirar() {
        if (cb1.getSaldoActual() > 0) {

            double retirar;
            System.out.println("Digite el dinero que quiere retirar de la cuenta:");
            retirar = leer.nextDouble();

            if (cb1.getSaldoActual() > retirar) {
                cb1.setSaldoActual(cb1.getSaldoActual() - retirar);
                System.out.println("Retiro $" + retirar + " su saldo actual es $" + cb1.getSaldoActual());
            } else {
                System.out.println("Usted retiro solo su disponile $" + cb1.getSaldoActual());
                cb1.setSaldoActual(0);
                System.out.println("Su saldo actual es $" + cb1.getSaldoActual());
            }
        } else {
            System.out.println("No posee dinero disponible en su cuenta para realizar el retiro");
        }
    }



    public void ExtraccionRapida() {
//Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. 
//Validar que el usuario no saque más del 20%.
        if (cb1.getSaldoActual() > cb1.getSaldoActual() * 0.20) {

            System.out.println("Usted retiro el 20% de su saldo ($" + (cb1.getSaldoActual() * 0.20));
            cb1.setSaldoActual(cb1.getSaldoActual() - (cb1.getSaldoActual() * 0.20));
            System.out.println("Su saldo disponible es de $" + cb1.getSaldoActual());
        } else {
            System.out.println("No posee diponible para realizar la extraccion");
        }
    }
    
    public void consultarSaldo(){
    
        System.out.println("Su saldo actual es $" + (cb1.getSaldoActual()));
       
}
    
    public void ConsultarDatos(){
        System.out.println(cb1.toString());
        
    }
}   
        
     
    
    





 