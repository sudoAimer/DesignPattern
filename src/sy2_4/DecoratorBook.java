package sy2_4;

public class DecoratorBook implements BookInterface {
    //抽象装饰类维护一个抽象构件的引用
    private BookInterface bookInterface;

    public DecoratorBook(BookInterface bookInterface) {
        this.bookInterface = bookInterface;
    }
    //通过引用实现构建对象的方法
    @Override
    public void borrowBook() {
        bookInterface.borrowBook();
    }

    @Override
    public void returnBook() {
        bookInterface.returnBook();
    }
}
