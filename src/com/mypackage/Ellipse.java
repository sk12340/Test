package com.mypackage;

public class Ellipse extends Rectangle {

    public Ellipse() {
        super();
    }

    public Ellipse(int semiMajorAxis, int semiMinorAxis) {
        super(semiMajorAxis, semiMinorAxis);
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * getLength() * getWidth());
    }

    @Override
    public String toString() {
        return "Ellipse [SemiMajorAxis=" + getLength() + ", SemiMinorAxis=" + getWidth() 
                + ", Area=" + getArea() + ", Sides=" + getSides() + "]";
    }
}