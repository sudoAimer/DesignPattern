package sy3_2;
public class Number {
    private double total;

    public Number() {
        total = 0;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void addition(double x) {
        total += x;
    }

    public void substraction(double x) {
        total -= x;
    }

    public void multiplication(double x) {
        total *= x;
    }

    public void division(double x) {
        total /= x;
    }
}
