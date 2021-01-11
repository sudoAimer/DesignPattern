package sy2_8;

public class Client {
    public static void main(String[]args) {
        DrawAngle drawAngle = new DrawAngle();
        DrawAdapter drawAdapter = new DrawAdapter(drawAngle);
        drawAdapter.insert("调用drawangle的方法");
    }
}
