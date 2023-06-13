
package Entidad;

/**
 *Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.

Estos métodos serán abstractos y los implementarán las siguientes clases:

• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
* 
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

16
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 * @author Flia. SANTILLAN
 */
public class EdificiodeOficinas extends Edificio{
    
    private int nroOficinas;
    private int cantPersxOficina;
    private int nroPisos;

    public EdificiodeOficinas() {
    }

    public EdificiodeOficinas(int nroOficinas, int cantPersxOficina, int nroPisos) {
        this.nroOficinas = nroOficinas;
        this.cantPersxOficina = cantPersxOficina;
        this.nroPisos = nroPisos;
    }
    

    public EdificiodeOficinas(int nroOficinas, int cantPersxOficina, int nroPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nroOficinas = nroOficinas;
        this.cantPersxOficina = cantPersxOficina;
        this.nroPisos = nroPisos;
    }
    

    public int getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(int nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public int getCantPersxOficina() {
        return cantPersxOficina;
    }

    public void setCantPersxOficina(int cantPersxOficina) {
        this.cantPersxOficina = cantPersxOficina;
    }

    public int getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(int nroPisos) {
        this.nroPisos = nroPisos;
    }

    @Override
    public String toString() {
        return super.toString() + "EdificiodeOficinas{" + "nroOficinas=" + nroOficinas + ", cantPersxOficina=" + cantPersxOficina + ", nroPisos=" + nroPisos + '}';
    }

    public void cantPersonas(){
        
        int persxPiso= cantPersxOficina * nroOficinas;
        int persxEdificio= persxPiso * nroPisos;
        
        System.out.println("Pueden ingresar "+(cantPersxOficina * nroOficinas)+ " personas por piso");
        System.out.println("Pueden ingresar "+ ((cantPersxOficina * nroOficinas)*nroPisos)+ 
                " personas en todo el edificio que tiene "+nroPisos+" pisos\n");
    }

    @Override
    public double calcularSuperficie() {
    
    return (2 * ((largo * ancho) + (largo * alto) + (ancho * alto)));
    }

    @Override
    public double calcularVolumen() {
    
    return (ancho*alto*largo);
    }
    
    
    
    
}
