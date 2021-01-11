package sy3_8;

public class LanguageBook implements Discount {
    public double des(double price) {
        System.out.println("Decrease 2 yuan.");
        return price-2;
    }
}
