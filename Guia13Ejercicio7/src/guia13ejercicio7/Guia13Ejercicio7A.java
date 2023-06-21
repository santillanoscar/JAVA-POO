package guia13ejercicio7;

/**
 *Dado el método metodoB de la clase B, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
class B {
public void metodoB() {
 sentencia_b1
try {
 sentencia_b2
} catch (MioException e){ 
 sentencia_b3 
}
finally
 sentencia_b4
 }
}
 * @author Flia-Santillan
 */
public class Guia13Ejercicio7A {

    public static void main(String[] args) {
        System.out.println("*** class B ***");
        {
    

    //public void metodoB() {
        System.out.println("sentencia_b1");
        try {
            System.out.println("sentencia_b2");
        } catch (MioException e) {
            System.out.println("sentencia_b3");
        } finally 
            System.out.println("sentencia_b4");
        }
    }
}
    

