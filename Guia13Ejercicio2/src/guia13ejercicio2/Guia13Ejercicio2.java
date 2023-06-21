package guia13ejercicio2;

/**
 *Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para 
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera 
de rango
 * @author Flia-Santillan
 */
public class Guia13Ejercicio2 {

    public static void main(String[] args) {

        int[] vector = new int[5];

        System.out.println("** vector 1 ***\n");
        try {
            //***CARGAR (modificar rango de i para probar el CATCH *** )
            for (int i = 0; i < 6; i++) {
                vector[i] = i;
            }
            //***MOSTRAR
            for (int i = 0; i < 5; i++) {
                System.out.println((vector[i]));
            }
            System.out.println("** Vector cargado de manera correcta\n");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR- Indice fuera de rango\n");
            System.out.println(e.toString() + "\n");
        }

    }

}
