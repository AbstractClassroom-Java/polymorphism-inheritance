package org.example.shapes;

public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-".repeat(50));
        sb.append("\nShare Information Details:")
            .append("\n\tShape: Rectangle")
            .append("\n\t\tLength = ").append(this.length)
            .append("\n\t\tWidth = ").append(this.width)
            .append("\n\t\tArea = ").append(this.getArea())
            .append("\n\t\tPerimeter = ").append(this.getPerimeter());
        return sb.toString();
    }

}
