package lab5;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString() {
        return "MovablePoint{" + "x=" + this.x + "y=" + this.y +", xSpeed=" + this.xSpeed +", ySpeed=" + this.ySpeed +'}';
    }

    
    public void moveUp() {
        this.y +=ySpeed;
    }

    
    public void moveDown() {
        this.y -= ySpeed;
    }

    
    public void moveLeft() {
        this.x -= xSpeed;
    }

    
    public void moveRight() {
        this.x +=xSpeed;
    }
}
