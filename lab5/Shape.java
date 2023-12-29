package lab5;

public abstract class Shape {
    protected String color;
    protected boolean fill;
    public Shape(){
        this.color = "";
        this.fill = false;
    }
    public Shape(String color, boolean fill){
        this.color = color;
        this.fill = fill;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return fill;
    }
    public void setFilled(boolean fill){
        this.fill = fill;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}

