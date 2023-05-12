/*
 Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron
el examen final. La escuela nos ha pedido que calculemos el promedio de notas
final de todos sus alumnos y saber qué alumnos han recibido una nota por encima
de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos 
van a ser nombre y nota (representando la nota obtenida en el final). 
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los
8 estudiantes con sus respectivas notas.

 */
package Entidad;

public class Estudiante {
    
    private String nombre;
    private int nota;

    public Estudiante() {
    }

    public Estudiante(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
    
    
}
