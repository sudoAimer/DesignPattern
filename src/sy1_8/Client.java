package sy1_8;

public class Client {
    public static void main(String[]args) {
        ScreenModeController screenModeController = new ScreenModeController();
        //完整模式
        screenModeController.setModelBuilder(new FullModeBuilder());
        MainScreen fullMode = screenModeController.construct();
        System.out.println(fullMode.getMenu());
        //精简模式
        screenModeController.setModelBuilder(new SimpleModeBuilder());
        MainScreen simpleMode = screenModeController.construct();
        System.out.println(simpleMode.getMainWindow());
    }
}
