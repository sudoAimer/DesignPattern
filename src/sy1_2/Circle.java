package sy1_2;

public class Circle implements Graphics {
    public int radius;
    @Override
    public void draw() {
        System.out.println("圆形绘制");
    }

    @Override
    public void erase() {
        System.out.println("圆形擦除");
    }
}
