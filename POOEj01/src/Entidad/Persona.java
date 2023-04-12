package Entidad;

public class Persona {

    public String nombre;
    public int edad;
    public String nacionalidad;

    
    /**
     * Al hacer click derecho sobre la clase se despliega un menu de opciones
     * que incluye una que dice "Insert code", inmediatamente se despliega otra
     * que dice "Generate", debemos seleccionar la que dice "Constructor". Al
     * abrirse la ventana emergente, podemos no seleccionar ninguna atributo lo
     * que nos creara un constructor por defecto, o seleccionar todos y nos
     * generara un constructor por parametro.
     */
    public Persona() {  
        // Esto es un Construcctor por defecto
    }

    public Persona(String nombre) {   //Éste es un constructor con parámetros
        this.nombre = nombre;
        /**
         * Para diferenciar entre los atributos del objeto y los identificadores
         * de los parámetros del método constructor, se utiliza la palabra this.
         * De esta forma, los parámetros del método pueden tener el mismo nombre
         * que los atributos de la clase.
         */
    }
    //Éste es un constructor con TODOS parámetros

    public Persona(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
  
    
    
    
    

    
    
    
}



