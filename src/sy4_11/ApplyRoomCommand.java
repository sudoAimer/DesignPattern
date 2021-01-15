package sy4_11;

public class ApplyRoomCommand implements AbstractCommand {
    private Transaction transaction;
    public ApplyRoomCommand(){
        transaction = new Transaction();
    }
    @Override
    public void execute() {
        transaction.applyRoom();
    }
}
