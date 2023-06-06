package Entidad;

import java.util.HashSet;
import java.util.Set;

/**
 Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
* 
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
 * @author osantillan
 */
public class Televisor extends Electrodomesticos{
    
    private int rersolucion;
    private boolean sintTDT;

    public Televisor() {
    }

    public Televisor(int rersolucion, boolean sintTDT) {
        this.rersolucion = rersolucion;
        this.sintTDT = sintTDT;
    }

    public Televisor(int rersolucion, boolean sintTDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.rersolucion = rersolucion;
        this.sintTDT = sintTDT;
    }

    public int getRersolucion() {
        return rersolucion;
    }

    public boolean isSintTDT() {
        return sintTDT;
    }

    public void setRersolucion(int rersolucion) {
        this.rersolucion = rersolucion;
    }

    public void setSintTDT(boolean sintTDT) {
        this.sintTDT = sintTDT;
    }
    
    public void crearTelevisor() {
        //    Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor.

        System.out.println(" Crear un Televisor");
        System.out.println("--------------------");

        crearElectrodomestico();

        System.out.println("Ingrese la resolucion del TV (en Pulgadas)");
        setRersolucion(leer.nextInt());
        String opcion;
        do {
            System.out.println("Ingrese (S/N) si el televisor tiene TDT");
            opcion = leer.next();
            if (opcion.equalsIgnoreCase("S")) {
                setSintTDT(true);
                break;
            } else {
                System.out.println("Intente nuevamente");
            }
        } while (!opcion.equalsIgnoreCase("S")&&(!opcion.equalsIgnoreCase("N")));
    }

    @Override
    public String toString() {
        super.toString();
        return "Televisor{" + "resolucion= " + rersolucion + ", Tiene TDT ? " + sintTDT + '}';
    }
    
    
    
    
}
