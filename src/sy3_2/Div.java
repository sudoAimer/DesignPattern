package sy3_2;
public class Div implements Count {
    @Override
    public void execute(Number n, double x) {
        System.out.print(n.getTotal() + " / " + x + " = ");
        n.division(x);
        System.out.println(n.getTotal());
    }
}
