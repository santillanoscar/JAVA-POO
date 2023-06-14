package Hoteles;

/**
 *
 * @author osantillan
 */
public class HotelCuatro extends Hoteles{
 
    protected boolean gimnasio;
    protected String NomResto;
    protected int capResto;

    public HotelCuatro(){
    }

    public HotelCuatro(boolean gimnasio, String NomResto, int capResto, int cantHabitaciones, int numCamas, int cantPisos, int precioHab, String nombre, String direccion, String localidad, String encargado) {
        super(cantHabitaciones, numCamas, cantPisos, precioHab, nombre, direccion, localidad, encargado);
        this.gimnasio = gimnasio;
        this.NomResto = NomResto;
        this.capResto = capResto;
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
        return super.toString()+ "\n*** HotelCuatro" + "\ngimnasio= " + gimnasio + "\nNomResto= " + NomResto + "\ncapResto= " + capResto+"\n";
    }

    public void precioHabitacion() {
        int suma = numCamas * cantHabitaciones * cantPisos;
        //*** SUMAR ADUICIONAL POR RESTO
        if (capResto < 30) {
            suma += 10;
        } else if (capResto < 50) {
            suma += 30;
        } else {
            suma += 50;
        }
        //*** SUMAR ADUICIONAL POR GIMNASIO
        if (gimnasio) {
            suma+=50;
        } else {
            suma+=30;
        }
        super.precioHab += suma;
        System.out.println("Precio Habitacion hotel 4*: $" + super.precioHab);
    }
    

    
    
    
    
}