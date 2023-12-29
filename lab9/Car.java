package lab9;

public class Car implements Nameable{
    String name;
    public Car(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    public String toString(){
        return "Car = "+ name;
    }
    public static void main(String[] args){
        Nameable n1 = new Car("audi");
        System.out.println(n1);
        System.out.println(n1.getName());
    }
}


    