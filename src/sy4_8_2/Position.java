package sy4_8_2;


public abstract class Position {
    protected String username;
    protected String position;
    protected Position successor;
    public Position(String username,String position){
        this.username = username;
        this.position = position;
    }

    public void setSuccessor(Position successor) {
        this.successor = successor;
    }
    public abstract void handle(Request request);
}
