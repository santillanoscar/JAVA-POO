/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejercicio2;

import Entidad.Electrodomesticos;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;

/**
 Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
* 
* 
 *Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 * @author Flia. SANTILLAN
 */
public class Guia12Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
   //****** EJERCICIO 2 *********
        
//        Lavadora lav1 = new Lavadora();
//        lav1.crearLavadora();
//        System.out.println(lav1);
//        Televisor t1 = new Televisor();
//        t1.crearTelevisor();
//        System.out.println(t1.toString());

   //***** EJERCICIO 3 **********  
    ArrayList <Electrodomesticos> listaElectro = new ArrayList<>();
    
        Lavadora lava1 = new Lavadora(35, 5000, "azul", 'a', 15);
        Lavadora lava2 = new Lavadora(20, 2000, "verde", 'c', 30);
        Televisor tv1 = new Televisor(55, true, 15000, "gris", 'a', 25);
        Televisor tv2 = new Televisor(32, false, 10000, "negro", 'b', 20);
        
        listaElectro.add(lava1);
        listaElectro.add(lava2);
        listaElectro.add(tv1);
        listaElectro.add(tv2);
        double suma=0;
        
        
                //*** PRECIO FINAL ***
        for (Electrodomesticos aux : listaElectro) {
            aux.precioFinal();
            suma+=aux.getPrecio();
        }

        System.out.println("");
        System.out.println("El precio total de Lavadoras es: $"+(lava1.getPrecio()+lava2.getPrecio()));
        System.out.println("El precio total de los TVs es: $"+(tv1.getPrecio()+tv2.getPrecio()));
        System.out.println("El precio total de los electrodomesticos es: $"+suma);
        System.out.println("");
        
    }

}
