package AlojamientoExtrahotelero;

import Entidad.HotelPadre;

/**
 *
 * @author osantillan
 */
public class ExtraHotelero extends HotelPadre{
    
    protected boolean privado;
    protected double metCuadrados;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, double metCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metCuadrados = metCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getMetCuadrados() {
        return metCuadrados;
    }

    public void setMetCuadrados(double metCuadrados) {
        this.metCuadrados = metCuadrados;
    }

    @Override
    public String toString() {
        return super.toString()+"ExtraHotelero{" + "privado=" + privado + ", metCuadrados=" + metCuadrados + '}';
    }
    
    
    
    
}
