package sy3_7;

public class CardGame {
    private State state;
    public CardGame()
    {
        this.state = new Primary(this);
        System.out.println("Welcome!");
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play(int score) {
        state.play(score);
    }

    public void doubleScore(int score) {
        state.doubleScore(score);
    }

    public void changeCards() {
        state.changeCards();
    }

    public void peekCards() {
        state.peekCards();
    }
}
