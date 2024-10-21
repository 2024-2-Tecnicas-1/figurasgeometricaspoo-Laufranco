
package com.mycompany.figurasgeometricas;


import java.util.Scanner;

public class TallerFigurasGeo {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura");
        String nombre = lector.nextLine();

        System.out.println("Ingrese el color de la figura");
        String color = lector.nextLine();

        System.out.println("Ingrese el tipo de figura, 1: Circulo, 2:Rectangulo, 3: Triangulo ");
        int tipodefigura = lector.nextInt();
        
        Principal figuras = null;

        switch (tipodefigura) {
            case 1:
                
                System.out.println("Ingerese el radio del circulo");
                double radio = lector.nextDouble();
                figuras = new circulo(nombre, color, radio);

                break;
                
            case 2:
                
                System.out.println("Ingerese el valor del lado a del rectangulo");
                double ladoa = lector.nextDouble();
                figuras = new circulo(nombre, color, ladoa);
                
                break;
                
            case 3:
                
                System.out.println("Ingerese el valor del lado b del rectangulo");
                double ladob = lector.nextDouble();
                figuras = new circulo(nombre, color, ladob);
                
                break;
                
            case 4:
                
                System.out.println("Ingerese el valor de la base del triangulo");
                double base = lector.nextDouble();
                figuras = new circulo(nombre, color, base);
               
                break;
                
            case 5:
                
                System.out.println("Ingerese el valor de la altura del triangulo");
                double altura = lector.nextDouble();
                figuras = new circulo(nombre, color, altura);
               
                break;
                
            default:
        }
    
        System.out.println("El area de la figura es " + figuras.areafigura());
            System.out.println("El perimetro de la figura es " + figuras.perimetrofigura());

    }
    
}

