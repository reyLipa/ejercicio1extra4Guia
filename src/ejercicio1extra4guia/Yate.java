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
public class Yate extends Barco {
    private int camarotes;
    private int potenciaCV;
    
    

//    public Yate(int camarotes, int potenciaCV, String matricula, double eslora, int anio) {
//        super(potenciaCV, matricula, eslora, anio);
//        this.camarotes = camarotes;

   

    public Yate(int camarotes, int potenciaCV, String matricula, double eslora, int anio) {
        super(matricula, eslora, anio);
        this.camarotes = camarotes;
        this.potenciaCV = potenciaCV;
    }

    @Override
    public double modulo() {
        return eslora*10+camarotes+potenciaCV; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
