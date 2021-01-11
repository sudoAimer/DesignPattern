package sy3_8;

public class NovelBook implements Discount {
    public double des(double price) {
        System.out.println("Decrease 10 yuan per 100 yuan");
        return price - (int)(price / 100) * 10;
    }
}
