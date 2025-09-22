package org.example.shapes.interfaces;

public interface Polygon extends Shape {
    int getNumberOfSides();

    default int getDimension() {
        return 2;
    }
}
