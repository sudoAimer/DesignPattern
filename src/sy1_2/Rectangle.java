package sy1_2;

public class Rectangle implements Graphics {
    public int  length;
    public int width;
    @Override
    public void draw() {
        System.out.println("矩形绘制");
    }

    @Override
    public void erase() {
        System.out.println("矩形擦除");
    }
}
