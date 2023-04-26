
package PaqueteServicio;

import Entidad.Pass;
import java.util.Scanner;

public class ServicioPass {
    
    Scanner leer = new Scanner(System.in);

    public ServicioPass() {
    }
    
    
    public ServicioPass(Pass x) {
        x.setPass("1234567890");
        x.setNombre("usuarioX");
        x.setDni(25701531);
    }
    
    public void IngresarPass(Pass x) {
        /*
Crear un método para ingresar una contraseña (crearPass). En este método, 
    debemos validar que la longitud sea correcta. (10). En caso de ser
    correcto, almaceno la contraseña. Si ingreso a esta opción del menú, 
    indefectiblemente deberá dejar su contraseña asignada.    */
        do {
            System.out.println("Ingrese una clave");
            x.setPass(leer.next());
            if (x.getPass().length() != 10) {
                System.out.println("La contraseña no cumple con los parametros(10 digitos)");
                System.out.println("Ingrese la contraseña nuevamente:");
                x.setPass(leer.next());
            }
        } while (x.getPass().length() != 10);
    }
    
    public void analizarPass(Pass x) {
        /*Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO*/
        int contZ = 0;
        int contA = 0;
        for (int i = 0; i < x.getPass().length(); i++) {
            if ((x.getPass().substring(i, i + 1)).equals("z")) {
                contZ++;
            }
            if ((x.getPass().substring(i, i + 1)).equals("a")) {
                contA++;
            }
        }
        if (contZ < 3) {
            System.out.println("El nivel es MEDIO");
        } else if (contZ < 2 && contA > 1) {
            System.out.println("El nivel es ALTO");
        } else {
            System.out.println("El nivel es bajo");
        }
    }
    
    public void modifNombreDni(Pass x) {
        /*Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.*/

        System.out.println("Ingrese contraseña ");
        String clave = leer.next();

        if (clave == x.getPass()) {
            System.out.println("Ingrese Nombre:");
            x.setNombre(leer.next());
            System.out.println("Ingrese DNI");
            x.setDni(leer.nextInt());

            System.out.println("Los datos fueron modificados correctamente. ");

        } else {
            System.out.println("La contraseña es incorrecta ");
        }
    }
    /* VERIFICAR ESTE METODO, ESTA INCOMPLETO
    public void modifContra(Pass x) {
    // Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
    //debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
    //acceso a modificar los datos.

        System.out.println("Ingrese contraseña actual");
        String clave = leer.next();

        if (clave == x.getPass()) {
            System.out.println("Ingrese nueva contraseña:");
            
            
            x.setNombre(leer.next());
            System.out.println("Ingrese DNI");
            x.setDni(leer.nextInt());

            System.out.println("Los datos fueron modificados correctamente. ");

        } else {
            System.out.println("La contraseña es incorrecta ");
        }
    }
    */
    
    public void menuOpciones(Pass x){
    /*A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios*/
    String opcion ="a";
    do {
            System.out.println("Seleccione una opcion\n"
                    + "A- Ingresar contraseña\n"
                    + "B- Nivel de contraseña \n"
                    + "C- modificar contraseña \n"
                    + "D- Modificar nombre \n"
                    + "E- Dividir 2 Fracciones \n"
                    + "F- Salir");
            opcion = leer.next().toUpperCase();

            switch (opcion) {
                case "A":
                   IngresarPass(x);
                    break;
                case "B":
                   analizarPass(x);
                    break;
                case "C":
                    System.out.println("Aca va modificar contraseña");
                    break;
                case "D":
                    modifNombreDni(x);
                    break;
                case "E":
                    System.out.println("Aca va modificar DNI");
                    break;
                case "F":
                    continue;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println(" ");
        
        } while (!opcion.equals("F")); 
    
    }
    
    
    
}