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
public class Velero extends Barco{
    private int mastiles;

    public Velero() {
    }

    
    public Velero(int mastiles, String matricula, double eslora, int anio) {
        super(matricula, eslora, anio);
        this.mastiles = mastiles;
    }

    @Override
    public double modulo() {
        return this.eslora*10+mastiles;
    }
    
    
}
