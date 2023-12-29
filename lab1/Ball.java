class Ball{
    private  String sport;
    private int size;
    public Ball(String n, int m){
        sport = n;
        size = m;
    }
    public Ball(String n){
        sport = n;
        size = 3;   
    }
    public Ball(){
        sport = "";
        size = 0;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setSport(String sport){
        this.sport = sport;
    }
    public String getSport(){
        return sport;
    }
    public int getSize() {
        return size;
    }
    public String toString(){
        return this.sport+", size"+this.size;
    }
}