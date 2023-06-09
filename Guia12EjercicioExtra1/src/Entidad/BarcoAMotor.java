package Entidad;

/**
 * Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
 *Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
 * @author Flia. SANTILLAN
 */
public class BarcoAMotor extends Barco{
 
        int potenciaEnCV;

    public BarcoAMotor() {
    }

    public BarcoAMotor(int potenciaEnCV, int matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
        this.potenciaEnCV = potenciaEnCV;
    }

    public int getPotenciaEnCV() {
        return potenciaEnCV;
    }

    public void setPotenciaEnCV(int potenciaEnCV) {
        this.potenciaEnCV = potenciaEnCV;
    }

    @Override
    public String toString() {
        return "BarcoAMotor{" + "potenciaEnCV=" + potenciaEnCV + '}';
    }

    

    @Override
    public void alquiler() {
        System.out.println(" ***** ALQUILER DE BARCO A MOTOR  *****");
        
        super.alquiler(); 
        
        System.out.println("Matricula: "+matricula);
        System.out.println("Metros de Eslora:"+eslora);
        
        potenciaEnCV=100;
        System.out.println("Potencia del Barco a Motor (en CV) "+potenciaEnCV);
        
        System.out.println("Adicional por Potencia del Barco a Motor (en CV)"+potenciaEnCV);
        alquiler+= potenciaEnCV;
        
        System.out.println("*******************************************************");
        System.out.println("El precio FINAL del alquiler del BARCO A MOTOR es: $"+alquiler);
        System.out.println("*******************************************************");
        System.out.println("");
    }
    

    
    
   
        
        
    
}
