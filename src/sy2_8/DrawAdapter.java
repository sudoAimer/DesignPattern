package sy2_8;

public class DrawAdapter extends DrawCircle {
    private DrawAngle drawAngle;

    public DrawAdapter(DrawAngle drawAngle) {
        this.drawAngle = drawAngle;
    }

    public void insert(String msg) {
        drawAngle.insert(msg);
    }
}
