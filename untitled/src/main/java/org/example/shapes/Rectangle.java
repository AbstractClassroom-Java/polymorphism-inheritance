package org.example.shapes;

import org.example.shapes.interfaces.Polygon;

public class Rectangle implements Polygon {
    protected final double length;
    protected final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2*this.length + 2*this.width;
    }

    public int getNumberOfSides() {
        return 4;
    }

    public String toString() {
        StringBuilder sb  =  new StringBuilder("Shape Information & Details");
        sb.append("\n\tShape : Rectangle")
                .append("\n\t\tLength : ").append(this.length)
                .append("\n\t\tWidth : ").append(this.width)
                .append("\n\t\tArea : ").append(this.getArea())
                .append("\n\t\tPerimeter : ").append(this.getPerimeter());
        return sb.toString();
    }
}
