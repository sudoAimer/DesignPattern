package sy3_5;
public class Client {
    public static void main(String args[]) {
        UserInfoDTO user = new UserInfoDTO("QiangqiangHuang","123456","17370838383");
        Caretaker c = new Caretaker();

        System.out.println("状态一：");
        c.addMemento(user);
        user.show();

        user.setPassword("666888");
        System.out.println("状态二：");
        c.addMemento(user);
        user.show();

        user.setTelNo("15817392511");
        System.out.println("状态三：");
        c.addMemento(user);
        user.show();

        user = c.undo(); //从备忘录中恢复
        System.out.println("回到状态二：");
        user.show();

        user = c.undo(); //从备忘录中恢复
        System.out.println("回到状态一：");
        user.show();
    }
}
