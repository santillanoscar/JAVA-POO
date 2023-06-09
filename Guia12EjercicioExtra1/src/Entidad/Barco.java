/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/**
 *En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
 * @author Flia. SANTILLAN
 */
public class Barco {
    
    protected int matricula;
    protected int eslora;
    protected int anio;
    protected final int MODULO=1000;
    protected int alquiler;
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Barco() {
    }

    public Barco(int matricula, int eslora, int anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAño() {
        return anio;
    }

    public void setAño(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anio=" + anio + '}';
    }

  
    
    
    
    public void alquiler(){
        
        System.out.println("El Precio del Modulo es $1000");
        
//        Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
//alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
//multiplicando por 10 los metros de eslora).
//En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
//sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
//en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
//el número de camarotes.
//Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
//métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
//precio final de su alquiler.
    
        System.out.println("Ingrese fecha de alquiler");
        System.out.println("*************************");
        System.out.println("Ingrese el dia de Alquiler: ");
        int diaA = leer.nextInt();
        System.out.println("Ingrese el mes de Alquiler: ");
        int mesA = leer.nextInt();
        System.out.println("Ingrese el año de Alquiler: ");
        int anioA = leer.nextInt();
      LocalDate fechaAlquiler = LocalDate.of(anioA, mesA, diaA);

        System.out.println("Ingrese fecha de Devolucion");
        System.out.println("*************************");
        System.out.println("Ingrese el dia de Devolucion: ");
        int diaD = leer.nextInt();
        System.out.println("Ingrese el mes de Devolucion: ");
        int mesD = leer.nextInt();
        System.out.println("Ingrese el año de Devolucion: ");
        int anioD = leer.nextInt();
      LocalDate fechaDevolucion = LocalDate.of(anioD, mesD, diaD);
        
        int dias = (int) ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        
        System.out.println("-------------------------------------");
        System.out.println("cantidad de dias de alquiler: "+dias);
        System.out.println("-------------------------------------");
        
        alquiler = dias * (MODULO*eslora);
    
        
    
    }
    
}
