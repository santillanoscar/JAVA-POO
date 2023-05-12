/*
 Crea una clase en Java donde declares una variable de tipo array de Strings
que contenga los doce meses del año, en minúsculas. A continuación, declara 
una variable mesSecreto de tipo String, y hazla igual a un elemento del array 
(por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que 
adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo
hace, pedir que vuelva a intentar adivinar el mes secreto.  Un ejemplo de 
ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
package Main;

import java.util.Scanner;

public class EjExtra1 {
    
    public static void main(String[] args) {
    
    String [] meses = new String [12]; 
        Scanner leer = new Scanner(System.in); //.useDelimiter("\n");
    
    meses[0]="enero";
    meses[1]="febrero";
    meses[2]="marzo";
    meses[3]="abril";
    meses[4]="mayo";
    meses[5]="junio";
    meses[6]="julio";
    meses[7]="agosto";
    meses[8]="septiembre";
    meses[9]="octubre";
    meses[10]="noviembre";
    meses[11]="diciembre";
    
    int numeroMes= (int) (Math.random() * 11 + 0); //asigno un numero random para asignar al mes secreto
    String mesSecreto = meses[numeroMes]; // asigno numero random al mes secreto
    String adivina;
           
        
        do {
            System.out.println("Adivine el mes secreto, introduzca el nombre de un mes");
            adivina= leer.next();
            
            if (!mesSecreto.equals(adivina)) {
                System.out.println("Incorrecto, intente nuevamente");
            } else {
                System.out.println("CORRECTO!!!");
                System.out.println("HAS ACERTADO EL MES SECRETO, ERA "+mesSecreto);
            }
            
        } while (!mesSecreto.equals(adivina));
        
    
    
    
    }   
}
