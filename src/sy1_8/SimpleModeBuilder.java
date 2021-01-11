package sy1_8;

public class SimpleModeBuilder extends ModelBuilder{

    @Override
    public void buildMenu() {
        screen.setMenu("空");
    }

    @Override
    public void buildPlayList() {
        screen.setPlayList("空");
    }

    @Override
    public void buildMainWindow() {
        screen.setMainWindow("精简模式主窗口");
    }

    @Override
    public void buildControlBar() {
        screen.setControlBar("精简模式控制条");

    }
}
