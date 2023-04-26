/*
 En NIFService se dispondrá de los siguientes métodos:

Método crearNif(): le pide al usuario el DNI y con ese DNI calcula 
la letra que le corresponderá. Una vez calculado, le asigna la letra 
que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion
y la letra en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de
un método que funciona de la siguiente manera: Para calcular la letra se toma 
el resto de dividir el número de DNI por 23 (el resultado debe ser un número 
entre 0 y 22). El método debe buscar en un array (vector) de caracteres la 
posición que corresponda al resto de la división para obtener la letra 
correspondiente. La tabla de caracteres es la siguiente:

 */
package PaqueteServicio;

import Entidad.Nif;
import java.util.Scanner;


public class ServicioNif {

    Scanner leer = new Scanner(System.in);
    Nif n1 = new Nif();

    public void CrearNif() {
        System.out.println("Ingrese su DNI;");
        n1.setDni(leer.nextLong());
        char[] lista = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        long posicion = n1.getDni() % 23;
        for (int i = 0; i < lista.length; i++) {
            if (posicion == i) {
                n1.setLetra(lista[i]);
            }

        }
    }

    public void Mostrar() {
        //Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion
//y la letra en mayúscula; por ejemplo: 00395469-F).
        System.out.println("El resultado es: " + n1.getDni() + " - " + n1.getLetra());
        System.out.println("");

    }
}
