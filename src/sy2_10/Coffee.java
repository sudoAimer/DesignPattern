package sy2_10;

public abstract class Coffee {
    //包含实现抽象类的对象
    protected Taste taste;

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    public Coffee(Taste taste) {
        this.taste = taste;
    }

    public abstract void makeCoffee();
}
