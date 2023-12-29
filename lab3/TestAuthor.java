package lab3;
public class TestAuthor{
    public static void main(String[] args){
        Author a1 = new Author("Л.Н.Толстой","lntolstoy@mail.ru", 'g');
        System.out.println(a1);
        a1.setEmail("NewEmail@mail.ru");
        System.out.println(a1.getEmail());
    }
}