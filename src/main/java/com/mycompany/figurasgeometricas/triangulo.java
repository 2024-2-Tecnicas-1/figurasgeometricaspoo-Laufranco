
package com.mycompany.figurasgeometricas;

public class triangulo extends Principal {

    private double base;
    private double altura;

    public triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    public double getbase() {
        return base;
    }

    public double getaltura() {
        return altura;
    }

    public void setbase(double base) {
        this.base = base;
    }

    public void setaltura(double altura) {
        this.altura = altura;
    }

    public double areatriangulo() {
        return (base * altura) / 2;
    }

    public double perimetrotriangulo() {
        return base + base + base;
    }
}

