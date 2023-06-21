package guia13ejercicio3;

import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 3 - Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos 
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer, 
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar 
una división con los dos numeros y mostrar el resultado
* 
*  4 - Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede 
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena 
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un 
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones 
utilizando bloques try/catch para las distintas excepciones

 * @author Flia-Santillan
 */
public class Guia13Ejercicio3 {

    public static void main(String[] args) {
        String n1;
        String n2;
        int num1;
        int num2;
        int num3;
        int num4;
        
        
        Scanner leer = new Scanner(System.in);//, "ISO-8859-1").useDelimiter("\n");
       try{
           
           System.out.println("Ingrese String 1° numero: ");
           n1 = leer.next();
           
           num1 = parseInt(n1);
           
           System.out.println("Ingrese String 2° numero: ");
           n2 = leer.next();
                      
           num2 = parseInt(n2);
           
             System.out.println("Division de Int num 1 / num2 = "+(num1/num2)+"\n");
           
           System.out.println("ingrese int 3° numero: ");
           num3=leer.nextInt();
           System.out.println("ingrese int 4° numero: ");
           num4=leer.nextInt();
           
           System.out.println("String num 1: "+ n1);
           System.out.println("String num 2: "+n2);
           System.out.println("Suma Strings num 1 + num 2 ="+(n1+n2));
           System.out.println("\nint num 3: "+ num3);
           System.out.println("int num 4: "+num4);
           System.out.println("Suma num 3 + num 4 = "+(num3+num4));
           
           System.out.println("\nParseint Convertir String num1 y num2: ");
           
           System.out.println(" num 1 + num2 = "+(num1+num2));
         
        
         
           
           
        
        }catch(InputMismatchException e){
           System.out.println("Ingreso incorrecto por teclado");
           System.out.println(e.toString()+"\n");
           
        }catch(NumberFormatException e1 ){
           System.out.println("La cadena no puede convertirse a entero");
           System.out.println((e1.toString())+"\n");
           
        }catch(ArithmeticException e2){
            System.out.println("No se puede dividir por cero");
            System.out.println((e2.toString()+"\n"));
        }
        
       
       
    }
    
    }
