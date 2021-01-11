package sy3_2;

public class Add implements Count {
    @Override
    public void execute(Number n, double x) {
        System.out.print(n.getTotal() + " + " + x + " = ");
        n.addition(x);
        System.out.println(n.getTotal());
    }
}
