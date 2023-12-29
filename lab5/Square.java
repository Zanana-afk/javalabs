package lab5;

class Square extends Rectangle{
    protected double side;
    public Square(){
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){return side;}
    public void setSide(double side){this.side = side;}
    public void setWidht(double side){this.side = side;}
    public void setLenght(double side){this.side = side;}
    public String toString(){
        return "Это квадрат, его сторона: " + side;
    }
}