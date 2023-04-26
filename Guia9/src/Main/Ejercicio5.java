/* */
package Main;

import Entidad.Ej5Persona;
import Servicios.ServicioEj5Persona;

public class Ejercicio5 {

    public static void main(String[] args) {
        // TODO code application logic here

        ServicioEj5Persona sp1 = new ServicioEj5Persona();
        Ej5Persona p1 = sp1.crearPersona();
        System.out.println("*************");

        System.out.println(" La edad es: " + sp1.calcularEdad(p1));
        System.out.println("**************");
        if (sp1.menorQue(p1)) {
            System.out.println("Es menor ");
        } else {
            System.out.println("Es mayor ");
        }
        System.out.println("*************");
        sp1.mostrarPersona(p1);

    }

}
