package sy2_2;

public class Windows extends OperatorSystem {
    @Override
    public void log() {
        String system="windows";
        this.language.language(system);//向下调用实现类的方法
    }
}
