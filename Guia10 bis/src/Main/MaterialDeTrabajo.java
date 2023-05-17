/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author osantillan
 */
public class MaterialDeTrabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        //Deteccion de errores:
        
        ArrayList<Integer> listadoNumeros = new ArrayList(); //OK
         
        TreeSet<String> listadoNombre = new TreeSet(); // OK

        HashMap<Integer, String> personas = new HashMap(); //OK
        
        //INSERTAR 5 NUMWEROS A ArrayList
        for (int i = 10; i < 15; i++) {
            int a = i ;
            listadoNumeros.add(a);
        } 
        System.out.println("*** mostrar valores del ArrayList***");
        for (Integer num : listadoNumeros) {
            System.out.println(num+"*");
        }
        //---------------------------------------------------
        // INSERTAR 5 NOMBRES A TreeSet
        for (int i = 0; i < 5; i++) {
            System.out.println("*(TreeSet)* Ingrese nombre-"+(i+1));
            String nombre = leer.next();
            listadoNombre.add(nombre);
        }
        System.out.println("*** mostrar valores de TreeSet (Conjuntos)***");
        for (String nom : listadoNombre) {
            System.out.println(nom);
        }
        //---------------------------------------------------
        // INSERTAR 5 OBJETOS A HashMap
        for (int i = 0; i < 5; i++) {
            int dni = (i+100);
            System.out.println("(HashMap) ingrese nombre del alumno:");
            String nombreAlumno = leer.next();
            personas.put(dni, nombreAlumno);
        }
        // MOSTRAR VALORES
        //entry.getKey trae la llave y entry.getValue trae valores del mapa 
        System.out.println("****MOSTRAR VALORES HASHMAP CON ENTRY.GETKEY Y ENTRY.GETVALUE**** ");
        for (Map.Entry <Integer, String> entry : personas.entrySet()){
            System.out.println("dni: "+ entry.getKey()+" nombre: "+entry.getValue());
        }
        //OTRA FORMA DE MOSTRAR ES:
        System.out.println("***MOSTRAR VALORES DE LLAVES DE HASHMAP *** ");
        for (Integer dni : personas.keySet()) {
            System.out.println(dni);
        }
        System.out.println("***MOSTRAR VALORES DE HASHMAP *** ");
        for (String nomb : personas.values()) {
            System.out.println(nomb);
            
        }
        
        System.out.println("*** DETECCION DE ERRORES 2 ***");
        HashMap <Integer, String> personas2 = new HashMap();
        int num1= 100;
        int num2= 200;
        String nom1="Albus";
        String nom2="Severus";
        personas2.put(num1, nom1);
        personas2.put(num2, nom2);
        System.out.println("***MOSTRAR HashMap PERSONAS2 ***");
        for (Map.Entry <Integer, String> entry : personas2.entrySet()){
            System.out.println("numero: "+ entry.getKey()+" nombre: "+entry.getValue());
        }
                
        
            
        
        
        
        
    }
    
}
