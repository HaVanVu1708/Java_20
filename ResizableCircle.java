package Java_20;

public class ResizableCircle extends Circle2 implements Resizable{
    public ResizableCircle(double radius){
        super(radius);
    }
    @Override
    public double resize(int percent){
        return super.getArea() * percent / 100;
    }
}
