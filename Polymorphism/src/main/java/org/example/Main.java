package org.example;

import org.example.shapes.Circle;
import org.example.shapes.Rectangle;
import org.example.shapes.Square;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle(7.0);
        System.out.println(circle);

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println(rectangle);

        // Create a Square object
        Square square = new Square(4.0);
        System.out.println(square);
    }
}