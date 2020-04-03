package Java_20;

import Java_20.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        super();
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{Shape[color = " + super.getColor() +
                ", filled = " + super.isFilled() + "]" +
                ", radius=" + radius +
                '}';
    }
}
