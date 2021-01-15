package sy4_11;

public class Client_11 {
    public static void main(String[] args) {
        AbstractCommand LeaveCommand,MeetingCommand,ApplyRoomCommand,ApplyThingCommand;
        LeaveCommand = new LeaveCommand();
        MeetingCommand = new MeetingCommand();
        ApplyRoomCommand = new ApplyRoomCommand();
        ApplyThingCommand = new ApplyThingCommand();

        Controller controller = new Controller(LeaveCommand,MeetingCommand,ApplyRoomCommand,ApplyThingCommand);
        controller.leave();
        controller.meeting();
        controller.applyRoom();
        controller.applyThing();
    }
}
