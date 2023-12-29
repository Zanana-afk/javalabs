package lab6;

public abstract class Dish {
    private String name;
    private String condition;
    public String getName() { return name; }
    public String getCondition() { return condition; }
    public Dish(String name, String condition){
        this.name = name;
        this.condition = condition;
    }
    public abstract void displayInfo();
}

class Fork extends Dish{
    private int volume;
    public Fork(String name, String condition, int volume){
        super(name,condition);
        this.volume = volume;
    }
    public void displayInfo(){
        System.out.println("Посуда :" + super.getName() +"Она: " + super.getCondition() +"Кол-во:" + volume);
    }
}

class Plate extends Dish{
    private int volume;
    public Plate(String name, String condition, int volume){
        super(name,condition);
        this.volume = volume;
    }
    public void displayInfo(){
        System.out.println("Посуда :" + super.getName() +"Она: " + super.getCondition() +"Кол-во:" + volume);
    }
}