package sy4_11;

public class MeetingCommand implements AbstractCommand {
    private Transaction transaction;
    public MeetingCommand(){
        transaction = new Transaction();
    }
    @Override
    public void execute() {
        transaction.meeting();
    }
}
