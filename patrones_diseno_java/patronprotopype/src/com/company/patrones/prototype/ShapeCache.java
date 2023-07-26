package com.company.patrones.prototype;

import java.util.HashMap;
import java.util.Map;

// ShapeCache.java
public class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // Este método es opcional y solo se utiliza para cargar las formas iniciales.
    public static void loadCache() {
        Circle circle = new Circle();
        circle.type = "Circle";
        shapeMap.put(circle.type, circle);

        Square square = new Square();
        square.type = "Square";
        shapeMap.put(square.type, square);
    }
}
