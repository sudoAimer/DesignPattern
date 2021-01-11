package sy2_4;

public class Client {
    public static void main(String[]args) {
        BookInterface bookInterface = new Book();//具体构件实现的功能
        bookInterface.borrowBook();
        bookInterface.returnBook();
        ConcreteDecoratorBook concreteDecoratorBook = new ConcreteDecoratorBook(bookInterface);
//具体装饰类实现的新功能
        concreteDecoratorBook.freeze();
        concreteDecoratorBook.lose();
    }
}
