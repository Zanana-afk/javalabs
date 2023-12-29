package lab5;

public class MovableCircle implements Movable{
    private int radius;
    MovablePoint center;
    public  MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    
    public String toString() {
        return "MovableCircle{" +
                "radius=" + this.radius +
                ", center=" + this.center.y + " "+this.center.ySpeed+" "+ this.center.xSpeed+" "+ this.center.x+
                '}';
    }
    
    public void moveUp() {
        MovablePoint ret = this.center;
        ret.y += this.center.ySpeed;
    }
    
    public void moveDown() {
        MovablePoint ret = this.center;
        ret.y -= this.center.ySpeed;
    }
    
    public void moveLeft() {
        MovablePoint ret = this.center;
        ret.x += this.center.xSpeed;
    }
    
    public void moveRight() {
        MovablePoint ret = this.center;
        ret.x -= this.center.xSpeed;
    }
}
