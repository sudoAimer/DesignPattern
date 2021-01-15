package sy4_11;

public class LeaveCommand implements AbstractCommand {
    private Transaction transaction;
    public LeaveCommand(){
        transaction = new Transaction();
    }
    @Override
    public void execute() {
        transaction.leave();
    }
}
