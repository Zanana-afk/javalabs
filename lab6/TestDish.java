package lab6;

public class TestDish {
    public static void main(String[] args){
        Plate p1 = new Plate("тарелка","не помыта", 6);
        Fork f1 = new Fork("Вилка ", "не помыта ", 2);
        f1.displayInfo();
        System.out.println("Это " + p1.getName());
    }
}
