package sy1_2;

public class SquareFactory implements GraphicsFactory{
    @Override
    public Graphics produceGraphics() {
        return  new Square();
    }
}
