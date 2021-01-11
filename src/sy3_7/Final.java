package sy3_7;

public class Final extends State {
    public Final(State state) {
        this.cg = state.cg;
        this.point = state.getPoint();
        this.stateName = "Final";
    }

    public void checkState() {
        if (point < 20) {
            cg.setState(new Primary(this));
            if (point < 0) {
                point = 0;
            }
        }
        else if (point < 50) {
            cg.setState(new Secondary(this));
        }
        else if (point < 100) {
            cg.setState(new Professional(this));
        }
    }
}
