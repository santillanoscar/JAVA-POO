
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
public class Yate extends Barco{
    
    
    int nroCamarotes;
    int potenciaEnCV;

    public Yate() {
    }

    public Yate(int nroCamarotes, int potenciaEnCV, int matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
        this.potenciaEnCV = potenciaEnCV;
        this.nroCamarotes = nroCamarotes;
    }

    public int getPotenciaEnCV() {
        return potenciaEnCV;
    }

    public void setPotenciaEnCV(int potenciaEnCV) {
        this.potenciaEnCV = potenciaEnCV;
    }

    public int getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(int nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "nroCamarotes=" + nroCamarotes + ", potenciaEnCV=" + potenciaEnCV + '}';
    }

       
  

    @Override
    public void alquiler() {
        
        System.out.println(" ***** ALQUILER DE YATE *****");
        
        super.alquiler(); 
      
        System.out.println("Matricula: "+matricula);
        System.out.println("Metros de Eslora:"+eslora);
        
        potenciaEnCV=500;
        System.out.println("Potencia del Barco a Motor (en CV) "+potenciaEnCV);
       
        nroCamarotes= 2;
        System.out.println("Cantidad de Camarotes: "+nroCamarotes);
        
        System.out.println("Adicional por Potencia del YATE (en CV) + Camarotes: "+((potenciaEnCV)+(nroCamarotes)));
        alquiler+= potenciaEnCV + nroCamarotes;
        
        System.out.println("*******************************************************");
        System.out.println("El precio FINAL del alquiler del YATE es: $"+alquiler);
        System.out.println("*******************************************************");
        System.out.println("");
        
    }
    

    
    
    
    
    
    
}
