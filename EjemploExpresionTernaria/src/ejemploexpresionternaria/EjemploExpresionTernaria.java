
package ejemploexpresionternaria;


public class EjemploExpresionTernaria {

    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    String digit1 = (i == 3) ? "E" : String.valueOf(i);
                    String digit2 = (j == 3) ? "E" : String.valueOf(j);
                    String digit3 = (k == 3) ? "E" : String.valueOf(k);
                    System.out.println(digit1 + "-" + digit2 + "-" + digit3);
                    /*La línea de código es una expresión ternaria, 
                    que se utiliza como atajo para una declaración de control de flujo 
                    "if-else". La sintaxis general de una expresión ternaria es la siguiente:
                    (condición) ? valor si verdadero : valor si falso;
                    En tu caso, la expresión ternaria se ve así:
                    (i == 3) ? "E" : Integer.toString(i);
                    Aquí está el paso a paso de lo que esta línea de código hace:
                    Evalúa la condición (i == 3).
                    Si la condición es verdadera, la expresión devolverá el valor "E".
                    Si la condición es falsa, la expresión devolverá el valor Integer.toString(i).
                    El valor devuelto se asigna a la variable digit1.
                    Por lo tanto, en resumen, si el valor de i es igual a 3, digit1 será igual a "E", 
                    y si el valor de i no es igual a 3, digit1 será igual a Integer.toString(i).
                    
                     */

                }

            }
        }
    }
}
