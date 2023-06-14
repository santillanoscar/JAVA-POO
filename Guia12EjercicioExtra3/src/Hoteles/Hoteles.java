package Hoteles;

import Entidad.HotelPadre;

/**
 *
 * @author osantillan
 */
public class Hoteles extends HotelPadre{
 
    protected int cantHabitaciones;
    protected int numCamas;
    protected int cantPisos;
    protected int precioHab;
    
    public Hoteles() {
        
    }
    
    public Hoteles(int cantHabitaciones, int numCamas, int cantPisos, int precioHab, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHab = precioHab;
    }

    
    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public int getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(int precioHab) {
        this.precioHab = 50;
    }

    @Override
    public String toString() {
        return super.toString() + "\n*** Hoteles " + "\ncantidad de Habitaciones= " + cantHabitaciones + "\nnumero de Camas= " + numCamas + "\ncantidad de Pisos= " + cantPisos + "\nprecio Habitacion= " + precioHab ;
    }
    
    public void precioHabitacion(){
    
    int suma = numCamas*cantHabitaciones*cantPisos;
    precioHab += suma ;
        System.out.println("Precio Habitacion hotel : $ "+precioHab);
    }
    
    
    
}
