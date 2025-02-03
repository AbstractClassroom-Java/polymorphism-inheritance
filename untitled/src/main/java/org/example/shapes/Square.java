package org.example.shapes;

public class Square extends Rectangle {

    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    public double getSideLength() {
        return length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Shape Information & Details");
        sb.append("\n\tShape : Square")
                .append("\n\t\tSide Length : ").append(this.length)
                .append("\n\t\tArea : ").append(this.getArea())
                .append("\n\t\tPerimeter : ").append(this.getPerimeter());
        return sb.toString();
    }

}
