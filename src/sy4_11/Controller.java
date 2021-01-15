package sy4_11;

public class Controller {
    private AbstractCommand LeaveCommand,MeetingCommand,ApplyRoomCommand,ApplyThingCommand;
    public Controller(AbstractCommand LeaveCommand,AbstractCommand MeetingCommand,AbstractCommand ApplyRoomCommand,AbstractCommand ApplyThingCommand){
        this.LeaveCommand = LeaveCommand;
        this.MeetingCommand = MeetingCommand;
        this.ApplyRoomCommand =ApplyRoomCommand;
        this.ApplyThingCommand = ApplyThingCommand;
    }
    public void leave(){
        LeaveCommand.execute();
    }
    public void meeting(){
        MeetingCommand.execute();
    }
    public void applyRoom(){
        ApplyRoomCommand.execute();
    }
    public void applyThing(){
        ApplyThingCommand.execute();
    }
}
