package Java_20;

import Java_20.GeometriObject;

public class Circle2 implements GeometriObject {
    private double radius;

    public Circle2(){
        this.radius = 1.0;
    }

    public Circle2(double radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
