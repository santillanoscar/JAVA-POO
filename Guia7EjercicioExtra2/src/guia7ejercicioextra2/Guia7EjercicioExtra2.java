
package guia7ejercicioextra2;

import Guia7EjercicioExtra2Entidad.Punto;
import javax.swing.JOptionPane;

public class Guia7EjercicioExtra2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Punto p1 = new Punto();
        
        p1.crearPuntos();
        
        System.out.println(" La distancia entre los 2 puentos es: "+ p1.resultado());
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        
        System.out.println("el numero 1 es :"+n1);
        
        
        
        
    }
    
}
