package sy2_9;

public class FlyCar {
    //包含Car类的引用
    private Car car;

    public FlyCar(Car car) {
        this.car = car;
        System.out.println("变成飞机");
    }

    public void move() {
//调用Car的对象实现
        car.move();
    }
    //增加新的功能
    public void fly() {
        System.out.println("在天空中飞翔");
    }
}
