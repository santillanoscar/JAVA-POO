/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejercicioguiaanimal.Entidad;

/**
 *
 * @author osantillan
 */
public class Gato extends Animal{
    
    private int edad;

    @Override
    public void hacerRuido() {
        super.hacerRuido(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Soy Gato y hago MIAUUUU!!!");
    }

    
}
