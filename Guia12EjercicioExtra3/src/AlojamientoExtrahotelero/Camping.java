package AlojamientoExtrahotelero;

/**
 *
 * @author osantillan
 */
public class Camping extends ExtraHotelero{
    
    protected int capMaxCarpas;
    protected int banios;
    protected boolean Resto;

    public Camping() {
    }

    public Camping(int capMaxCarpas, int banios, boolean Resto, boolean privado, double metCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metCuadrados, nombre, direccion, localidad, gerente);
        this.capMaxCarpas = capMaxCarpas;
        this.banios = banios;
        this.Resto = Resto;
    }

    public int getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(int capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public int getBanios() {
        return banios;
    }

    public void setBanios(int banios) {
        this.banios = banios;
    }

    public boolean isResto() {
        return Resto;
    }

    public void setResto(boolean Resto) {
        this.Resto = Resto;
    }

    @Override
    public String toString() {
        return super.toString()+"\n**** Camping{ " + "\ncapacidad Maxima de Carpas= " + capMaxCarpas + "\nbaños= " + banios + "\ntiene Resto?= " + Resto +"\n";
    }
    
    
}
