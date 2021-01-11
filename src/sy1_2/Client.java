package sy1_2;

public class Client {
    public static void main(String[]args) {
        //简单工厂
        Graphics circle = SimpleFactory.produceGraphics("C");
        Graphics rectangle = SimpleFactory.produceGraphics("R");
        Graphics square = SimpleFactory.produceGraphics("S");
        circle.draw();
        rectangle.draw();
        square.draw();
        //工厂模式
        System.out.println("========工厂方法模式============");
        GraphicsFactory circleFactory = new CircleFactory();
        Graphics graphics1 = circleFactory.produceGraphics();
        graphics1.draw();
        graphics1.erase();

        GraphicsFactory rectangleFactory = new RectangleFactory();
        Graphics graphics2 = rectangleFactory.produceGraphics();
        graphics2.draw();
        graphics2.erase();

        GraphicsFactory squareFactory = new SquareFactory();
        Graphics graphics3 = squareFactory.produceGraphics();
        graphics3.draw();
        graphics3.erase();

    }
}
