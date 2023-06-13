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
        return super.toString()+"\nPotencia en CV: "+ potenciaEnCV+"\n"; //To change body of generated methods, choose Tools | Templates.
    }

 

    

    @Override
    public void alquiler() {
        System.out.println(" ***** ALQUILER DE BARCO A MOTOR  *****");
        
        super.alquiler(); 
        potenciaEnCV*=1000;
        System.out.println("Adicional por Potencia del Barco a Motor (en CV) $"+potenciaEnCV);
        alquiler+= potenciaEnCV;
        
        System.out.println("*******************************************************");
        System.out.println("El precio FINAL de alquiler de BARCO A MOTOR es: $"+alquiler);
        System.out.println("*******************************************************");
        System.out.println("");
    }
    

    
    
   
        
        
    
}
