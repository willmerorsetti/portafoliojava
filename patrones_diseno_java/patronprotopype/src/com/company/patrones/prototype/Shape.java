package com.company.patrones.prototype;

public interface Shape {
    void draw();
    Shape clone();
    String getType();
}
