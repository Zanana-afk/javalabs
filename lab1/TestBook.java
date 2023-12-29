public class TestBook {
    public static void main(String args[]){
        Book f1 = new Book("1984","J.Orwell", 320);
        Book f2 = new Book("Идиот","Ф.Достаевский");
        f2.setNumbOfPages(640);
        Book f3 = new Book("Война и Мир");
        f3.setAuthor("Л.Н.Толстой");
        f3.setNumbOfPages(1300);
        System.out.println(f1);
        System.out.println(f2.getName());
        System.out.println(f2.getNumbOfPages());
        System.out.println(f3.getAuthor());
        System.out.println(f3.getNumbOfPages());
    }
}
