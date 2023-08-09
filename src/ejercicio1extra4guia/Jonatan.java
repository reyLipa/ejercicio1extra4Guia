/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1extra4guia;

/**
 *
 * @author pc
 */
public class Jonatan {
     private int precio;
    private String marca;
    private int modelo;
    
    public Computadora(int precio, String marca, int modelo){
     this.precio=precio;
     this.marca=marca;
     this.modelo=modelo;
    }
    public Computadora(){}

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
}
