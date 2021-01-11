package sy3_8;
public class ComputerBook implements Discount {
    public double des(double price) {
        System.out.println("Discount 10%.");
        return price*0.9;
    }
}