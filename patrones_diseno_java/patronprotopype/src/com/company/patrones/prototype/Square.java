package com.company.patrones.prototype;

public class Square implements Shape{
   public String type ;


    public void setType(String type) {
    this.type = type;
}

    public String getType() {
    return type;
}

    Square(){
        this.type="Circle";
    }

    @Override
    public void draw() {
         System.out.println("2 ");
        System.out.println("Dibujando Square");
         System.out.println(" ");
    }

    @Override
    public Shape clone() {
        System.out.println("Paso Square clone()");
        return new Square();
    }
    
}
