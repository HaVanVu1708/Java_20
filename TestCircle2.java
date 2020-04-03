package Java_20;

import Java_20.GeometriObject;

public class TestCircle2 {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        System.out.println(c1);
        System.out.println("Area is " + c1.getArea());
        System.out.println("Perimeter is " + c1.getPerimeter());

        Circle2 c2 = new Circle2(2.3);
        System.out.println(c2);
        System.out.println("Area is " + c2.getArea());
        System.out.println("Perimeter is " + c2.getPerimeter());
    }
}
