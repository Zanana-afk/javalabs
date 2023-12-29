package lab4;

public class TestCircle {
    public static void main(String[] args){
        Circle c1 = new Circle(5,"blue");
        Circle c2 = new Circle(5);
        c2.setColor("red");
        System.out.println(c1);
        System.out.println(c2);
    }
}
