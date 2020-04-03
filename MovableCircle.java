package Java_20;

import Java_20.Movable;

public class MovableCircle implements Movable {
    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    @Override
    public void moveUp(){
        center.y -= center.ySpeed;
    }

    @Override
    public void moveDown(){
        center.x -= center.xSpeed;
    }

    @Override
    public void moveLeft(){
        center.y += center.ySpeed;
    }

    @Override
    public void moveRight(){
        center.x += center.xSpeed;
    }
}
