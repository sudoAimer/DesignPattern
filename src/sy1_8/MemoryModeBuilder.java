package sy1_8;

public class MemoryModeBuilder extends ModelBuilder {
    @Override
    public void buildMenu() {
        screen.setMenu("空");
    }

    @Override
    public void buildPlayList() {
        screen.setPlayList("记忆模式播放列表");
    }

    @Override
    public void buildMainWindow() {
        screen.setMainWindow("记忆模式主窗口");
    }

    @Override
    public void buildControlBar() {
        screen.setControlBar("记忆模式控制条");
    }
}
