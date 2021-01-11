package sy3_7;

public class Secondary extends State {
    public Secondary(State state) {
        this.cg = state.cg;
        this.point = state.getPoint();
        this.stateName = "Secondary";
    }

    public void changeCards() {
        System.out.println("Sorry, you don't have permission!");
    }

    public void peekCards() {
        System.out.println("Sorry, you don't have permission!");
    }

    public void checkState() {
        if (point >= 100) {
            cg.setState(new Final(this));
        }
        else if (point >= 50) {
            cg.setState(new Professional(this));
        }
        else if (point < 20) {
            cg.setState(new Primary(this));
            if (point < 0) {
                point = 0;
            }
        }
    }
}
