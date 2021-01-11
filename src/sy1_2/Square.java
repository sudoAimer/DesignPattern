package sy1_2;

public class Square implements Graphics{
    public int length;
    @Override
    public void draw() {
        System.out.println("圆形绘制");
    }

    @Override
    public void erase() {
        System.out.println("圆形擦除");
    }
}
