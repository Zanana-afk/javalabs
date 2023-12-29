package lab10;
public class Var14 {
    public static int Recurs(int n){
        if (n < 10){
            return n;
        }
        else{
            System.out.println(n % 10 + " ");
            return Recurs(n / 10);
        }
    }
    public static void main(String[] args){
        System.out.println(Recurs(123));
    }
}