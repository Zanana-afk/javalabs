package lab4;

public class Circle {
    private int r;
    private String color;
    public Circle(int r, String color){
        this.r = r;
        this.color = color;
    }
    public Circle(int r){
        this.r = r;
        this.color = "";
    }
    public Circle(){
        this.r = 0;
        this.color = "";
    }
    public void setRadius(int r){
        this.r = r;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getRadius(){
        return r;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        return "круг радиусом "+this.color +" цвет: "+ this.r;
    }
}
