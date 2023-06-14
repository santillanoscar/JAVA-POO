package Hoteles;

/**
 *
 * @author osantillan
 */
public class HotelCinco extends HotelCuatro{
    
    protected int cantSalonConf;
    protected int cantSuites;
    protected int cantLimosinas;

  

    public HotelCinco(int cantSalonConf, int cantSuites, int cantLimosinas, boolean gimnasio, String NomResto, int capResto, int cantHabitaciones, int numCamas, int cantPisos, int precioHab, String nombre, String direccion, String localidad, String encargado) {
        super(gimnasio, NomResto, capResto, cantHabitaciones, numCamas, cantPisos, precioHab, nombre, direccion, localidad, encargado);
        this.cantSalonConf = cantSalonConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }
    
    public int getCantSalonConf() {
        return cantSalonConf;
    }

    public void setCantSalonConf(int cantSalonConf) {
        this.cantSalonConf = cantSalonConf;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n*** Hotel Cinco" + "\n cantidad Salon Conferencia=" + cantSalonConf + "\ncantidad de Suites=" + cantSuites + "\ncantidad de Limosinas=" + cantLimosinas+"\n" ;
    }

    public void precioHabitacion(){
        int suma = numCamas * cantHabitaciones * cantPisos;
        //*** SUMAR ADICIONAL POR RESTO
        if (capResto < 30) {
            suma += 10;
        } else if (capResto < 50) {
            suma += 30;
        } else {
            suma += 50;
        }
        //*** SUMAR ADICIONAL POR GIMNASIO
        if (gimnasio) {
            suma+=50;
        } else {
            suma+=30;
        }
        //*** SUMAR ADICIONAL POR GIMNASIO
        suma+= (cantLimosinas*15);
        
        //*** TOTAL PRECIO HABITACION
        super.precioHab += suma;
        System.out.println("Precio Habitacion hotel 5*: $" + super.precioHab);
    }
    
    
}
