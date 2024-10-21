package com.mycompany.figurasgeometricas;

public class Principal {

   private String nombre;    
private String color;    

public Principal (String nombe, String color ){
    this.nombre = nombre;
    this.color = color;
    
    
}
public String getnombre (){
    return nombre;
}

public String getcolor (){
    return color;
    
}
public void setnombre(String nombre){
    this.nombre = nombre;
}

public void setcolor(String color){
    this.color = color;
    
}

public double areafigura(){
    return 0;
}
public double perimetrofigura(){
    return 0;
}

}

