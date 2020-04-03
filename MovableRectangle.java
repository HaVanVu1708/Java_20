package Java_20;

import Java_20.Movable;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp(){
        topLeft.y -= topLeft.ySpeed;
    }

    @Override
    public void moveDown(){
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveLeft(){
        topLeft.x -= topLeft.xSpeed;
    }

    @Override
    public void moveRight() {
        bottomRight.x += bottomRight.xSpeed;
    }
}
