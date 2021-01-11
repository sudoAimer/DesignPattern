package sy3_2;
public class Calculation {
    private Count add, min, mul, div;

    public Calculation(Count add, Count min, Count mul, Count div) {
        this.add = add;
        this.min = min;
        this.mul = mul;
        this.div = div;
    }

    public void addition(Number n, double x) {
        System.out.print("Addition: ");
        add.execute(n, x);
    }

    public void substraction(Number n, double x) {
        System.out.print("Substraction: ");
        min.execute(n, x);
    }

    public void multiplication(Number n, double x) {
        System.out.print("Multiplication: ");
        mul.execute(n, x);
    }

    public void division(Number n, double x) {
        System.out.print("Division: ");
        div.execute(n, x);
    }

    public void undo(Number n, double x, String s) {
        System.out.print("Undo: ");
        if(s.equalsIgnoreCase("addition")) {
            min.execute(n, x);
        } else if(s.equalsIgnoreCase("substraction")) {
            add.execute(n, x);
        }
        else if(s.equalsIgnoreCase("multiplication")) {
            div.execute(n, x);
        }
        else if(s.equalsIgnoreCase("division")) {
            mul.execute(n, x);
        }
    }

    public void redo(Number n, double x, String s)
    {
        System.out.print("Redo: ");
        if (s.equalsIgnoreCase("addition")) {
            add.execute(n, x);
        }
        else if (s.equalsIgnoreCase("substraction")) {
            min.execute(n, x);
        }
        else if (s.equalsIgnoreCase("multiplication")) {
            mul.execute(n, x);
        }
        else if (s.equalsIgnoreCase("division")) {
            div.execute(n, x);
        }
    }
}
