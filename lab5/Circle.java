package lab5;
import java.math.*;

public class Circle extends Shape {
    protected double radius;
    public Circle(){
        this.fill = false;
        this.color = "blue";
        this.radius = 1;
    }
    public Circle(double radius){
        this.fill = false;
        this.color = "blue";
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.fill = filled;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI*radius*radius;
    }
    
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    
    public String toString() {
        return "Shape: circle radius: "+this.radius+", color: "+this.color+" Plosh "+getArea();
    }
}