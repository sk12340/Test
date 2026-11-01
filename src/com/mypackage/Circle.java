package com.mypackage;

public class Circle extends Shape {

    private int radius;

    public Circle() {
        super(0);
    }

    public Circle(int radius) {
        super(0);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return "Circle [Radius=" + radius + ", Area=" + getArea() + ", Sides=" + getSides() + "]";
    }
}