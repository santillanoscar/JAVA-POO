package Entidad;

import java.util.HashSet;
import java.util.Set;

/**
 * Se debe crear también una subclase llamada Televisor con los siguientes
 * atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de
 * los atributos heredados. Los constructores que se implementarán serán: • Un
 * constructor vacío. • Un constructor con la resolución, sintonizador TDT y el
 * resto de los atributos heredados. Recuerda que debes llamar al constructor de
 * la clase padre.
 *
 * Los métodos que se implementara serán: • Método get y set de los atributos
 * resolución y sintonizador TDT.
 *
 * • Método crearTelevisor(): este método llama a crearElectrodomestico() de la
 * clase padre, lo utilizamos para llenar los atributos heredados del padre y
 * después llenamos los atributos del televisor. • Método precioFinal(): este
 * método será heredado y se le sumará la siguiente funcionalidad. Si el
 * televisor tiene una resolución mayor de 40 pulgadas, se incrementará el
 * precio un 30% y si tiene un sintonizador TDT incorporado, aumentará $500.
 * Recuerda que las condiciones que hemos visto en la clase Electrodomestico
 * también deben afectar al precio.
 *
 * @author osantillan
 */
public class Televisor extends Electrodomesticos {

    private int resolucion;
    private boolean sintTDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintTDT) {
        this.resolucion = resolucion;
        this.sintTDT = sintTDT;
    }

    public Televisor(int resolucion, boolean sintTDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintTDT = sintTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintTDT() {
        return sintTDT;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
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

        System.out.println("Ingrese la resolucion de la TV (en Pulgadas)");
        setResolucion(leer.nextInt());
        String opcion;
        do {
            System.out.println("Desea un TV con sintonizador de TDT (S/N): ");
            opcion = leer.next();
            if (opcion.equalsIgnoreCase("S")) {
                setSintTDT(true);
                break;
            } else {
                System.out.println("Intente nuevamente");
            }
        } while (!opcion.equalsIgnoreCase("S") && (!opcion.equalsIgnoreCase("N")));

        precioFinal();
    }

    @Override
    public void precioFinal() {
//    Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.
        super.precioFinal();

        if (resolucion > 40) {
            this.precio = precio*1.3;
        }
        if (sintTDT) {
            this.precio = precio + 500;
        }
       
        System.out.println("El precio del televisor es:"+precio);
    }

    @Override
    public String toString() {
        super.toString();

        return "TELEVISOR: " + "\n"
                + "precio= $" + precio + "\n"
                + "color= " + color + "\n"
                + "consumoEnergetico= " + consumoEnergetico + "\n"
                + "peso= " + peso + " Kg \n"
                + "resolucion= " + resolucion + "\n"
                + "Tiene TDT ?= " + (sintTDT ? "SI" : "NO\n");
    }

}
