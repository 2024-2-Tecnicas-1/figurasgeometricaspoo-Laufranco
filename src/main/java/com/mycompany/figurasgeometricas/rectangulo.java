
package com.mycompany.figurasgeometricas;

public class rectangulo extends Principal {

    private double ladoa;
    private double ladob;

    public rectangulo(String nombre, String color, double ladoa, double ladob) {
        super(nombre, color);
        this.ladoa = ladoa;
        this.ladob= ladob;
    }

    public double getladoa() {
        return ladoa;
    }

    public double getladob() {
        return ladob;
    }

    public void setladoa(double ladoa) {
        this.ladoa = ladoa;
    }

    public void setladob(double ladob) {
        this.ladob= ladob;
    }

    public double arearectangulo() {
        return ladoa * ladob;
    }

    public double perimetrorectangulo() {
        return ladoa + ladoa + ladob + ladob;
    }
}
