package Hoteles;

/**
 *
 * @author osantillan
 */
public class HotelCuatro extends Hoteles{
 
    protected boolean gimnasio;
    protected String NomResto;
    protected int capResto;


    public HotelCuatro(boolean gimnasio, String NomResto, int capResto, int cantHabitaciones, int numCamas, int cantPisos, int precioHab, String nombre, String direccion, String localidad, String encargado) {
        super(cantHabitaciones, numCamas, cantPisos, precioHab, nombre, direccion, localidad, encargado);
        this.gimnasio = gimnasio;
        this.NomResto = NomResto;
        this.capResto = capResto;
    }
    
    public int precioHabitacion(){
        int sumaPrecioHabitacion= numCamas*cantHabitaciones*cantPisos;
        super.precioHab = sumaPrecioHabitacion;
    return precioHab;
    }

    public boolean isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNomResto() {
        return NomResto;
    }

    public void setNomResto(String NomResto) {
        this.NomResto = NomResto;
    }

    public int getCapResto() {
        return capResto;
    }

    public void setCapResto(int capResto) {
        this.capResto = capResto;
    }

    @Override
    public String toString() {
        return super.toString()+ "HotelCuatro{" + "gimnasio=" + gimnasio + ", NomResto=" + NomResto + ", capResto=" + capResto + '}';
    }

   
    

    
    
    
    
}