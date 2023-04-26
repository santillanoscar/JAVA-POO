/*
 Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). 
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos 
soluciones, para que esto ocurra, el discriminante debe ser mayor 
Método tieneRaiz(): devuelve un booleano indicando si tiene una única 
solución, para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́  true, imprime 
las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́  true imprime una 
única raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y 
mostrará por pantalla las posibles soluciones que tiene nuestra ecuación 
con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan 
nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el 
signo delante de -b

 */
package PaqueteServicio;

import Entidad.Raices;
import java.util.Scanner;

public class RaicesServicio {

    Scanner leer = new Scanner(System.in);

    Raices r1 = new Raices();

    public void llenarValores() {
        System.out.println("Ingrese al valor de A");
        r1.setA(leer.nextInt());
        System.out.println("Ingrese al valor de B");
        r1.setB(leer.nextInt());
        System.out.println("Ingrese al valor de C");
        r1.setC(leer.nextInt());
    }

    public double getDiscriminante() {
//Método getDiscriminante(): devuelve el valor del discriminante (double). 
//El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
        double discriminante = Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC();
        return discriminante;
    }

    public boolean tieneRaices() {

        return (getDiscriminante() > 0);

    }

    public boolean tieneRaiz() {
        return (getDiscriminante() == 0);

    }

    public void obtenerRaices() {
        if (tieneRaices() == true) {
            //(-b±√((b^2)-(4*a*c)))/(2*a)
            //      (b^2)-4*a*c
            double raizNeg = -r1.getB() - Math.sqrt(getDiscriminante()) / (2 * r1.getA());
            System.out.println("La solucion negativa es " + raizNeg);
            ////(-b±√((b^2)-(4*a*c)))/(2*a)
            double raizPos = -r1.getB() + Math.sqrt(getDiscriminante()) / (2 * r1.getA());
            System.out.println("La solucion positiva es " + raizPos);
        } else {
            System.out.println("No tiene 2 raices o no tiene solucion");
        }
    }

    public void obtenerRaiz() {
        //Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́  true imprime una 
//única raíz. Es en el caso en que se tenga una única solución posible.

        if (tieneRaiz() == true) {
            //(-b±√((b^2)-(4*a*c)))/(2*a)
            //      (b^2)-4*a*c
            double raizNeg = -r1.getB() - Math.sqrt(getDiscriminante()) / (2 * r1.getA());
            System.out.println("La solucion negativa es " + raizNeg);
            ////(-b±√((b^2)-(4*a*c)))/(2*a)
            double raizPos = -r1.getB() + Math.sqrt(getDiscriminante()) / (2 * r1.getA());
            System.out.println("La solucion positica es " + raizPos);
        } else {
            System.out.println("La solucion tiene 2 raices o no tiene solucion");
        }

    }

    public void calcular() {
        /* Método calcular(): esté  método llamará  a tieneRaices() y a tieneRaíz(), y 
mostrará  por pantalla las posibles soluciones que tiene nuestra ecuación 
con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan 
nuestros métodos y en caso de no existir solución, se mostrará un mensaje.*/
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No tiene Solucion");
        }
    }
}
