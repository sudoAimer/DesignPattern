package sy2_5;

public class Client {
    public static void main(String[]args) {
        System.out.println("电脑开机");
        Mainframe mainframe = new Mainframe();
        mainframe.on();
    }
}

