package sy3_8;

public class Client {
    public static void main(String args[])
    {
        double price = 520;
        System.out.println("Price is " + price);

        Discount discount = (Discount) new NovelBook();
        double newPrice = discount.des(price);
        System.out.println("Price after discount is " + newPrice);
    }
}
