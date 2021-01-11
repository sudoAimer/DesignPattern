package sy1_8;

public class FullModeBuilder extends ModelBuilder {
    @Override
    public void buildMenu() {
        screen.setMenu("完整模式菜单");
    }

    @Override
    public void buildPlayList() {
        screen.setPlayList("完整模式播放列表");
    }

    @Override
    public void buildMainWindow() {
        screen.setMainWindow("完整模式主窗口");
    }

    @Override
    public void buildControlBar() {
        screen.setControlBar("完整模式控制条");
    }
}
