package org.example.shapes;

public class Circle implements IShape{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getDiameter() {
        return 2 * this.radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getPerimeter() {
        return getCircumference();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Shape Information & Details");
        sb.append("\n\tShape : Circle")
                .append("\n\t\tRadius : ").append(this.radius)
                .append("\n\t\tDiameter : ").append(this.getDiameter())
                .append("\n\t\tArea : ").append(this.getArea())
                .append("\n\t\tCircumference : ").append(this.getCircumference());
        return sb.toString();
    }
}
