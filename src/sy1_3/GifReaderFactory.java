package sy1_3;

public class GifReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader produceReaderFactory() {
        return new GifReader();
    }
}
