public class Book {
    private String name;
    private String author;
    private int numbOfPages;
    public Book(String n, String a, int numb){
        name = n;
        author = a;
        numbOfPages = numb;
    }
    public Book(String n, String a){
        name = n;
        author = a;
        numbOfPages = 0;
    }
    public Book(String n){
        name = n;
        author = "unknown author";
        numbOfPages = 0;
    }
    public Book(){
        name = "No name";
        author = "unknown author";
        numbOfPages = 0;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setNumbOfPages(int numbOfPages){
        this.numbOfPages = numbOfPages;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getNumbOfPages(){
        return numbOfPages;
    }   
    public String toString(){
        return this.name+", Author : "+this.author+", Numb of pages = "+this.numbOfPages;
    }   
}
