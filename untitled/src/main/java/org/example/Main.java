package org.example;

import org.example.shapes.Circle;
import org.example.shapes.Rectangle;
import org.example.shapes.Square;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4,3);
        System.out.println(rect1);

        Square sqr1 = new Square(5);
        System.out.println(sqr1);

        Circle cir1 = new Circle(5);
        System.out.println(cir1);

    }
}