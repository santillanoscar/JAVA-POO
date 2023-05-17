
package Entidad;

import java.util.Comparator;

/**
 *Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 * @author osantillan
 */
public class Perro {
            
    private String razaPerro;

    public Perro() {
    }

    public Perro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    public String getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    @Override
    public String toString() {
        return "Perro{" + "razaPerro=" + razaPerro + '}';
    }
 

    public static Comparator <Perro> compararperro = new Comparator <Perro>() {
        @Override
        public int compare(Perro t1, Perro t) {
        return t1.getRazaPerro().compareTo(t.getRazaPerro());

        }
    };
}            


