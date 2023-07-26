package com.company.patrones.prototype;

import java.util.HashMap;
import java.util.Map;

public class MiAppPatrones {
     public static void main(String[] args) throws Exception {
        System.out.println("------------------------------ ");        
        System.out.println("diseño Prototype ");
        System.out.println("------------------------------ ");

        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("Circle");
        System.out.println("Shape: " + clonedShape1.getType()); // Debería imprimir "Shape: Circle"
        clonedShape1.draw(); // Debería imprimir "Drawing a circle."

        Shape clonedShape2 = ShapeCache.getShape("Square");
        System.out.println("Shape: " + clonedShape2.getType()); // Debería imprimir "Shape: Square"
        clonedShape2.draw(); // Debería imprimir "Drawing a square."
    }
}



