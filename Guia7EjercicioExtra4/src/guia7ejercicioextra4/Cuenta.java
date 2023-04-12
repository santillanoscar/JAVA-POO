/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de 
dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo 
después de realizar una transacción de retiro.

 */
package guia7ejercicioextra4;

import java.util.Scanner;


public class Cuenta {
 
    double saldo;
    String titular;

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cuenta() {
    }

    
    public void retirarDinero() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Su saldo actual es "+saldo);
        
        System.out.println("Ingrese el titular de la cuenta:");
        String titular = leer.nextLine();
        System.out.println("Ingrese el valor a retirar de la cuenta:");
        double retiro = leer.nextDouble();
        
        if (this.saldo >= retiro) {
            this.saldo = saldo - retiro;
            System.out.println(titular+" retiraste $"+ retiro+ " tu saldo es $" + saldo);
        } else {
            System.out.println(titular+" No puedes retirar $"+retiro+ " tu saldo es $"+saldo);
        
        }
        
    
    }
   } 
    
    
    
    
    
    
    

