package sy3_7;

public abstract class State {
    protected CardGame cg;
    protected int point;
    protected String stateName;
    public abstract void checkState();

    public void play(int score) {
        point += score;
        checkState();
        System.out.println("Point: " + point + "  level: " + cg.getState().getStateName());
    }

    public void doubleScore(int score) {
        if (score > 0) {
            point += score * 2;
        }
        else if (score < 0) {
            point -= score;
        }
        checkState();
        System.out.println("Point: " + point + "  level: " + cg.getState().getStateName());
    }

    public void changeCards() {
        System.out.println("Change cards");
    }

    public void peekCards() {
        System.out.println("Peek cards");
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
