package sy2_10;

public class MiddleCoffee extends Coffee {
    public MiddleCoffee(Taste taste) {
        super(taste);
    }

    @Override
    public void makeCoffee() {
        System.out.println("制作中杯咖啡");
////调用在实现类接口中定义的方法
        taste.pourCoffee();
    }
}
