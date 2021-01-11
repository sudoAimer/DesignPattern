package sy1_3;

public class Client {
    public static void main(String[]args) {
        GifReaderFactory gifReaderFactory = new GifReaderFactory();
        ImageReader imageReader1 = gifReaderFactory.produceReaderFactory();
        imageReader1.read();
        ImageReaderFactory imageReaderFactory = new JpgReaderFactory();
        ImageReader imageReader2 = imageReaderFactory.produceReaderFactory();
        imageReader2.read();
    }
}
