package lab2;

public class Practise2 {
    int m;
    public Practise2(int numb){
        m = numb;
    }
    public int getFact(){
        int summ = 1;
        for(int i = 1; i < this.m; i ++){
            summ = summ * i;
        }
        return summ;
    }
    
}
