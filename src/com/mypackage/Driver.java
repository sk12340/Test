package com.mypackage;

public class Driver {

    public static void main(String[] args) {
        System.out.println("--- RECTANGLES ---");
        Rectangle rect1 = new Rectangle();
        rect1.setLength(10);
        rect1.setWidth(5);
        System.out.println(rect1);

        Rectangle rect2 = new Rectangle(8, 4);
        System.out.println(rect2);

        System.out.println("\n--- CIRCLES ---");
        Circle circle1 = new Circle();
        circle1.setRadius(7);
        System.out.println(circle1);

        Circle circle2 = new Circle(3);
        System.out.println(circle2);

        System.out.println("\n--- ELLIPSES ---");
        Ellipse ellipse1 = new Ellipse();
        ellipse1.setLength(6);
        ellipse1.setWidth(4);
        System.out.println(ellipse1);

        Ellipse ellipse2 = new Ellipse(5, 2);
        System.out.println(ellipse2);
    }
}