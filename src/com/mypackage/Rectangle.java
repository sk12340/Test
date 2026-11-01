package com.mypackage;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle() {
        super(4);
    }

    public Rectangle(int length, int width) {
        super(4);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle [Length=" + length + ", Width=" + width + ", Area=" + getArea() + ", Sides=" + getSides() + "]";
    }
}