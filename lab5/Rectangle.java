package lab5;

class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        width = 0;
        length = 0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled ){
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){return width;}
    public void setWidht(double width){this.width = width;}
    public double getLength(){return length;}
    public void setlength(double length){this.length = length;}
    public double getArea(){return width*length;}
    public double getPerimeter(){return 2 * (length+width);}
    public String toString(){
        return "Это прямоугольник " + width + " на " + length  + " площадь " + this.getArea();
    }
    
}