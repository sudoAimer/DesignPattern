package sy1_8;

public class ScreenModeController {
    private ModelBuilder modelBuilder;

    public void setModelBuilder(ModelBuilder modelBuilder) {
        this.modelBuilder = modelBuilder;
    }
    public MainScreen construct() {
        modelBuilder.buildMenu();
        modelBuilder.buildPlayList();
        modelBuilder.buildMainWindow();
        modelBuilder.buildControlBar();
        return modelBuilder.getScreen();
    }
}
