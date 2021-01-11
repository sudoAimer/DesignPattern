package sy2_10;

public class BigCoffee extends Coffee {
    public BigCoffee(Taste taste) {
        super(taste);
    }

    @Override
    public void makeCoffee() {
        System.out.println("制作大杯咖啡");
//调用在实现类接口中定义的方法
        taste.pourCoffee();

    }
}
