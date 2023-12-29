public class TestBall {
    public static void main(String[] agrs){
        Ball b1 = new Ball("Football",5);
        Ball b2 = new Ball("BasketBall",7);
        Ball b3 = new Ball("VolleyBall");
        b3.setSize(6);
        System.out.println(b1);
        System.out.println(b2.getSport());
        System.out.println(b3.getSize());
    }
    
}
