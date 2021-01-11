package sy3_7;

public class Client {
    public static void main(String args[])
    {
        CardGame cg = new CardGame();

        cg.play(20);
        System.out.println("--------------------------------");
        cg.changeCards();
        cg.play(-20);
        System.out.println("--------------------------------");
        cg.play(80);
        System.out.println("--------------------------------");
        cg.doubleScore(150);
        System.out.println("--------------------------------");
        cg.play(-300);
        System.out.println("--------------------------------");
        cg.peekCards();
        cg.doubleScore(20);
        System.out.println("--------------------------------");
        cg.changeCards();
        cg.play(20);
        System.out.println("--------------------------------");
    }
}
