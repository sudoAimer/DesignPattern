package sy2_2;

public class Linux extends OperatorSystem {
    @Override
    public void log() {
        String system="Linux";
        this.language.language(system);//向下调用实现类的方法
    }
}
