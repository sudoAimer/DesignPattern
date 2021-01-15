package sy4_8_2;

public class Employer extends Position {
    public Employer(String username,String position){
        super(username, position);
    }
    @Override
    public void handle(Request request) {
        if (request.getNumber() ==0){
            System.out.println("由普通员工负责补货");
        }else {
            if (this.successor !=null)
                this.successor.handle(request);
        }
    }
}