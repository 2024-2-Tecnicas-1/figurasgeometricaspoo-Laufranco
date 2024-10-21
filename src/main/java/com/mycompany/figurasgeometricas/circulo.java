
package com.mycompany.figurasgeometricas;

public class circulo extends Principal {

    private double radio;

    public circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;

    }

    public double getradio() {
        return radio;
    }

    public void setradio(double radio) {
        this.radio = radio;
    }

    public double areacirculo() {
        return Math.PI * radio * radio;
    }

    public double perimetrocirculo() {
        return Math.PI * radio;
    }
}
