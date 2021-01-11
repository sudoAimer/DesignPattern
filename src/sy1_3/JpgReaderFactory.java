package sy1_3;

public class JpgReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader produceReaderFactory() {
        return new JpgReader();
    }

}
