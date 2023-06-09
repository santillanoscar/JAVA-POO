package Entidad;

import java.util.Scanner;

/**
 * Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
 *Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
* 
* Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
* 
 * @author Flia. SANTILLAN
 */
public class Velero extends Barco{
    
    int mastiles;
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Velero() {
    }

    public Velero(int mastiles, int matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "mastiles=" + mastiles + ", leer=" + leer + '}';
    }

    

    
//    @Override
//    public String toString() {
//        
//        return "VELERO\n"+ "matricula:"+matricula + "\n"+ "eslora=" + eslora +"Mts.\n"+ "mastiles: "+ mastiles+"\n";
//    }

    @Override
    public void alquiler() {
        System.out.println(" ***** ALQUILER DE VELERO *****");
        
        super.alquiler();
        
        System.out.println("Matricula: "+matricula);
        System.out.println("Metros de Eslora:"+eslora);
        System.out.println("Numero de mastiles del Velero: "+ mastiles);
        
        
        System.out.println("Adicional por cantidad de mastiles: $"+mastiles);
        alquiler+= mastiles;
        
        System.out.println("*******************************************************");
        System.out.println("El precio FINAL del alquiler del VELERO es: $"+alquiler);
        System.out.println("*******************************************************");
    }

    
    
    
}
