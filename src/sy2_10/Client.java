package sy2_10;

public class Client {
    public static void main(String[]args) {
//程序运行时具体实现类对象替换父类对象，提供不同的业务操作方法
        Taste tasteWithMilk = new WithMilk();
        BigCoffee bigCoffee = new BigCoffee(tasteWithMilk);
        bigCoffee.makeCoffee();
        System.out.println("-----------------------------");
        Taste tasteWithoutMilk = new WithoutMilk();
        MiddleCoffee middleCoffee = new MiddleCoffee(tasteWithoutMilk);
        middleCoffee.makeCoffee();
    }
}

