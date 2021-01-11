package sy2_9;

public class Client {
    public static void main(String[]args) {
        Car car = new Car();
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
        flyCar.fly();
    }
}
