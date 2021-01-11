package sy1_2;

public class RectangleFactory implements GraphicsFactory{
    @Override
    public Graphics produceGraphics() {
        return new Rectangle();
    }
}
