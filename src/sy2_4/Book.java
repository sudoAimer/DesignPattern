package sy2_4;

public class Book implements BookInterface {
    @Override
    public void borrowBook() {
        System.out.println("在图书馆借书");
    }

    @Override
    public void returnBook() {
        System.out.println("在图书馆还书");
    }
}
