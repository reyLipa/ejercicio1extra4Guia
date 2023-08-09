/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1extra4guia;

import static java.lang.Math.abs;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Isabel
 */
public class Alquiler {
    private String nombreCliente, documentoCliente;
    private LocalDate fechaAlquiler, fechaDevolucion;
    private String posicionAmarre;
    private Barco barco;
    private double precioFinal;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, String documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
        //precioFinal =((int) ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion))*barco.modulo();
    }

    

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    public void numDiasAlquiler(){
        int dias=((int) ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion));
        System.out.println(abs(dias));
    }
    public void precioFinal(){
        int ab=((int) ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion));
        System.out.println(ab*barco.modulo());
        
    }
   
    

}
