package sy4_11;

public class ApplyThingCommand implements AbstractCommand {
    private Transaction transaction;
    public ApplyThingCommand(){
        transaction = new Transaction();
    }
    @Override
    public void execute() {
        transaction.applyThing();
    }
}
