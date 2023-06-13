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
    
    public int precioHabitacion(){
        int sumaPrecioHabitacion= numCamas*cantHabitaciones*cantPisos;
        this.precioHab= sumaPrecioHabitacion;
    return precioHab;
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
        return super.toString()+ "HotelCinco{" + "cantSalonConf=" + cantSalonConf + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + '}';
    }

    
    
    
}
