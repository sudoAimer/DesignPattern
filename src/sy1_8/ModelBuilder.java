package sy1_8;

public abstract class ModelBuilder {
    protected MainScreen screen = new MainScreen();
    public abstract void buildMenu();
    public abstract void buildPlayList();
    public abstract void buildMainWindow();
    public abstract void buildControlBar();
    public MainScreen getScreen() {
        return screen;
    }
}
