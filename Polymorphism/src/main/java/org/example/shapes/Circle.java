package org.example.shapes;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    double getDiameter() {
        return 2 * this.radius;
    }

    double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-".repeat(50));
        sb.append("\nShape Details:")
            .append("\n\tShape: Circle")
            .append("\n\t\tRadius = ").append(this.radius)
            .append("\n\t\tArea = ").append(this.getArea())
            .append("\n\t\tCircumference = ").append(this.getCircumference());

        return sb.toString();
    }
}
