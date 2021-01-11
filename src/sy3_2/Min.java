package sy3_2;

public class Min implements Count {
    @Override
    public void execute(Number n, double x) {
        System.out.print(n.getTotal() + " - " + x + " = ");
        n.substraction(x);
        System.out.println(n.getTotal());
    }
}
