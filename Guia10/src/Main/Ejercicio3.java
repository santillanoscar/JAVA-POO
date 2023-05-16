package Main;

import Servicio.ServicioAlumno;

/**
 *
 * @author osantillan
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ServicioAlumno sa = new ServicioAlumno();
        
        sa.cargarAlumno();
        sa.mostrarAlumnoNotas();
        sa.notaFinal();
    }
    
}
