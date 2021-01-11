package sy2_4;

public class ConcreteDecoratorBook extends DecoratorBook {
    public ConcreteDecoratorBook(BookInterface bookInterface) {
        super(bookInterface);
    }
    //增加新行为
    public void freeze() {
        System.out.println("冻结书籍");
    }

    public void lose() {
        System.out.println("遗失书籍");
    }
}
