package sy3_7;

public class Primary extends State {
    public Primary(State state) {
        this.cg = state.cg;
        this.point = state.getPoint();
        this.stateName = "Primary";
    }

    public Primary(CardGame cg) {
        this.point = 0;
        this.cg = cg;
        this.stateName = "Primary";
    }

    public void doubleScore(int score) {
        System.out.println("Sorry, you don't have permission!");
    }

    public void changeCards() {
        System.out.println("Sorry, you don't have permission!");
    }

    public void peekCards() {
        System.out.println("Sorry, you don't have permission!");
    }

    public void checkState() {
        if (point >= 100)
        {    cg.setState(new Final(this));    }
        else if (point >= 50)
        {    cg.setState(new Professional(this));    }
        else if (point >= 20)
        {    cg.setState(new Secondary(this));    }
        else if (point < 0)
        {    point = 0;    }
    }
}
