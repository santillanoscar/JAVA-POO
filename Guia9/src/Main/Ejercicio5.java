/* */
package Main;

import Entidad.Ej5Persona;
import Servicios.ServicioEj5Persona;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        

        ServicioEj5Persona sp1 = new ServicioEj5Persona();
        Ej5Persona p1 = sp1.crearPersona();
        System.out.println("*************");

        System.out.println(" La edad es: " + sp1.calcularEdad(p1));
        System.out.println("**************");
        
        System.out.println("Ingrese la edad a comparar: ");
        int edad = leer.nextInt();
                if (sp1.menorQue(p1, edad)) {
            System.out.println("Es menor ");
        } else {
            System.out.println("Es mayor ");
        }
        System.out.println("*************");
        sp1.mostrarPersona(p1);

    }

}
