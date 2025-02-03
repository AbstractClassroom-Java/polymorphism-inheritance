package org.example.shapes;

public class Square {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-".repeat(50));
        sb.append("\nShape Information Details:")
            .append("\n\tShape: Square")
            .append("\n\t\tSide = ").append(this.side)
            .append("\n\t\tArea = ").append(this.getArea())
            .append("\n\t\tPerimeter = ").append(this.getPerimeter());
        return sb.toString();
    }
}
