/*
 Un profesor particular está dando cursos para grupos de cinco alumnos y 
necesita un programa para organizar la información de cada curso. Para ello, 
crearemos una clase entidad llamada Curso, cuyos atributos serán: 
nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  
precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de 
dimensión 5 (cinco), donde se alojarán los nombres de cada alumno. A 
continuación, se implementarán los siguientes métodos:
Un constructor por defecto.
Un constructor con todos los atributos como parámetro.
Métodos getters y setters de cada atributo.

 */
package Entidad;

public class Ej6Curso {
    
    private String nombreCurso;
    private int cantHorasXDia;
    private int cantDiasXSemana;
    private String turno;
    private int precioXHora;
    private String alumnos [] = new String [5]; 

    public Ej6Curso() {
    }

    public Ej6Curso(String nombreCurso, int cantHorasXDia, int cantDiasXSemana, String turno, int precioXHora) {
        this.nombreCurso = nombreCurso;
        this.cantHorasXDia = cantHorasXDia;
        this.cantDiasXSemana = cantDiasXSemana;
        this.turno = turno;
        this.precioXHora = precioXHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantHorasXDia() {
        return cantHorasXDia;
    }

    public void setCantHorasXDia(int cantHorasXDia) {
        this.cantHorasXDia = cantHorasXDia;
    }

    public int getCantDiasXSemana() {
        return cantDiasXSemana;
    }

    public void setCantDiasXSemana(int cantDiasXSemana) {
        this.cantDiasXSemana = cantDiasXSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioXHora() {
        return precioXHora;
    }

    public void setPrecioXHora(int precioXHora) {
        this.precioXHora = precioXHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
     
}

