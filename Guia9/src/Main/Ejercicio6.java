/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Ej6Curso;
import Servicios.ServicioEj6Curso;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        ServicioEj6Curso sc1 = new ServicioEj6Curso();
        
        Ej6Curso v1 = new Ej6Curso();
        
        
       sc1.crearCurso();
       sc1.calcularGanancia(v1);
        
          
        
        
        
       /*System.out.println("En cuantos cursos dicta clases ? :");
        int CantCurso = leer.nextInt();
 
        Ej6Curso[] cc = new Ej6Curso[CantCurso];

        for (int i = 0; i < CantCurso; i++) {
            cc[i] = sc1.crearCurso();

            sc1.calcularGanancia(cc[i]);
        }*/

    }
}
