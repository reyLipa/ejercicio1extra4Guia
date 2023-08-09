/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1extra4guia;

/**
 *
 * @author Isabel
 */
public class BarcoMotor extends Barco {
    protected int potenciaCV;

    public BarcoMotor() {
    }

    
    public BarcoMotor(int potenciaCV, String matricula, double eslora, int anio) {
        super(matricula, eslora, anio);
        this.potenciaCV = potenciaCV;
    }

    @Override
    public double modulo() {
       return this.eslora*10+potenciaCV;
    }
    
    
    
}
