/*
 Crear la clase servicio que contenga métodos para sumar, restar, multiplicar
y dividir fracciones. Mostrar por pantalla un menú de opciones para que el 
usuario decida que ver
 */
package PaqueteServicios;

import Entidad.Fraccion;
import java.util.Scanner;


public class ServicioFraccion {
    Scanner leer = new Scanner(System.in);
    
    public void CrearFracciones(Fraccion x){
        System.out.println("Ingrese Numerador 1 :");
        x.setN1(leer.nextDouble());
        System.out.println("Ingrese Denominador 1 :");
        x.setD1(leer.nextDouble());
        System.out.println("Ingrese Numerador 2 :");
        x.setN2(leer.nextDouble());
        System.out.println("Ingrese Denominador 2 :");
        x.setD2(leer.nextDouble());
           
    }
// SUMAR FRACCIONES => SUMANDO MULTIPLICACION DE NUMERADORES CRUZADAS
// Y MULTIPLICANDO DENOMINADORES ( SI EL DENOMINADOR ES DISTINTO)
    public void CrearSuma(Fraccion x) {
        double sumarN;
        double sumarD;
        if (x.getD1() == x.getD2()) { // SI LOS DENOMINADORES SON IGUALES
            sumarN = x.getN1() + x.getN2();
            System.out.println("EL RESULTADO DE LA SUMA DE LAS FRACCIONES ES : " + sumarN + "/" + x.getD1());
            
        } else { // SI LOS DENOMINADORES SON DISTINTOS
            sumarN = (x.getD1() * x.getN2()) + (x.getD2() * x.getN1());
            sumarD = (x.getD1() * x.getD2());
            System.out.println("EL RESULTADO DE LA SUMA DE LAS FRACCIONES ES :" + sumarN + "/" + sumarD);
            System.out.println("Pasado a decimal seria " + sumarN / sumarD);
        }
    }
// OTRA OPCION DE SUMAR FRACCIONES, BUSCANDO MCM Y MCD
    public void CrearSuma2(Fraccion x) {
        double suma = 0;
        if (x.getD1() == x.getD2()) {
            suma = x.getN1() + x.getN2();
            System.out.println("Suma" + suma + "/" + x.getD1());
        } else {
            double mcm = mcm(x);
            double auxN1 = (mcm / x.getD1() * x.getN1());
            double auxN2 = (mcm / x.getD2() * x.getN2());
            System.out.println("EL RESULTADO DE LA SUMA DE LAS FRACCIONES ES: " + (auxN1 + auxN2) + "/" + mcm + " es: " + (auxN1 + auxN2) / mcm);
        }
    }
    public double mcd(double c, double d) {

        double a = Math.max(c, d);
        double b = Math.min(c, d);
        double resultado = 0;
        do {
            resultado = b;
            b = a % b;
            a = resultado;
        } while (b != 0);
        return resultado;
    }
    public double mcm(Fraccion x) {
        double a = Math.max(x.getD1(), x.getD2());
        double b = Math.min(x.getD1(), x.getD2());
        double resultado = (a / mcd(x.getD1(), x.getD2())) * b;
        return resultado;
    }

// RESTAR FRACCIONES => RESTANDO MULTIPLICACION DE NUMERADORES CRUZADAS
// Y MULTIPLICANDO DENOMINADORES (SI EL DENOMINADOR ES DISTINTO)
    public void CrearResta(Fraccion x) {
        double restar = 0;
        if (x.getD1() == x.getD2()) {
            restar = x.getN1() - x.getN2();
            System.out.println("EL RESULTADO DE LA RESTA DE LAS FRACCIONES ES: " + restar + "/" + x.getD1());
        } else {
            double restarN = (x.getD1() * x.getN2()) - (x.getD2() * x.getN1());
            double restarD = (x.getD1() * x.getD2());
            System.out.println("EL RESULTADO DE LA RESTA DE LAS FRACCIONES ES: " + restarN + "/" + restarD);
            System.out.println("Pasado a decimal seria " + restarN / restarD);
        }
    }

    public void CrearMulti(Fraccion x) {
        double multiN = x.getN1() * x.getN2();
        double multiD = x.getD1() * x.getD2();
        System.out.println("EL RESULTADO DE LA MULTIPLICACION DE LAS FRACCIONES ES: " + multiN + "/" + multiD);
    }
    public void CrearDivision(Fraccion x) {
        double divN = x.getN1() / x.getD2();
        double divD = x.getD1() / x.getN2();
        System.out.println("EL RESULTADO DE LA DIVISION DE LAS FRACCIONES ES: " + divN + "/" + divD);
    }
    

}




