package sy1_2;

public class CircleFactory implements GraphicsFactory{
    @Override
    public Graphics produceGraphics() {
        return new Circle();
    }
}
