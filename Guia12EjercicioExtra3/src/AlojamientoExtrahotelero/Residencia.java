package AlojamientoExtrahotelero;

/**
 *
 * @author osantillan
 */
public class Residencia extends ExtraHotelero {

    protected int cantHabitaciones;
    protected boolean descGremios;
    protected boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean descGremios, boolean campoDeportivo, boolean privado, double metCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metCuadrados, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descGremios = descGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescGremios() {
        return descGremios;
    }

    public void setDescGremios(boolean descGremios) {
        this.descGremios = descGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return super.toString() + "Residencia{" + "cantHabitaciones=" + cantHabitaciones + ", descGremios=" + descGremios + ", campoDeportivo=" + campoDeportivo + '}';

    }
}
