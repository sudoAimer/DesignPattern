package sy3_2;

public class Client {
    public static void main(String args[])
    {
        Count add, min, mul, div;
        add = new Add();
        min = new Min();
        mul = new Mul();
        div = new Div();
        Calculation c = new Calculation(add, min, mul, div);
        Number num = new Number();
        System.out.println(num.getTotal());
        String method;
        c.addition(num, 888);
        method = "addition";
        c.addition(num, 888);
        method = "addition";
        c.undo(num, 888, method);
        c.substraction(num, 8);
        method = "substraction";
        c.multiplication(num, 2);
        method = "multiplication";
        c.redo(num, 10, method);
        c.redo(num, 10, method);
        c.undo(num, 10, method);
        c.division(num, 2);
        method = "division";
        c.redo(num, 2, method);
    }
}
