package sy4_8_2;

public class Manager extends Position {
    public Manager(String username,String position){
        super(username, position);
    }
    @Override
    public void handle(Request request) {
        if (request.getNumber() ==1){
            System.out.println("由经理负责补货");
        }else {
            if (this.successor !=null)
                this.successor.handle(request);
        }

    }
}