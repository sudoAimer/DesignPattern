package sy3_7;


public class Professional extends State {
    public Professional(State state)
    {
        this.cg = state.cg;
        this.point = state.getPoint();
        this.stateName = "Professional";
    }

    public void peekCards() {
        System.out.println("Sorry, you don't have permission!");
    }

    public void checkState() {
        if (point >= 100) {
            cg.setState(new Final(this));
        }
        else if (point < 20) {
            cg.setState(new Primary(this));
            if (point < 0) {
                point = 0;
            }
        }
        else if (point < 50) {
            cg.setState(new Secondary(this));
        }
    }

}
