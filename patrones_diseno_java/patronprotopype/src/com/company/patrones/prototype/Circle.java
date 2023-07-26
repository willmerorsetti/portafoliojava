package com.company.patrones.prototype;

public class Circle implements Shape {
    public String type ;


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    Circle(){
        this.type="Circle";
    }

    @Override
    public void draw() {
         System.out.println("1 ");
        System.out.println("Dibujando Circulo");
         System.out.println(" ");
    }

    @Override
    public Shape clone() {
        System.out.println("Paso Circle clone()");
        return new Circle();
    }

    
}
