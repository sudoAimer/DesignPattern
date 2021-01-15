package sy4_8_2;

public class Request {
    private String time;
    private int status;   //0代表未完成，1代表完成
    private int number;    //0代表由普通员工负责，1代表由经理负责

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Request(String time, int status, int number){
        this.time = time;
        this.status = status;
        this.number = number;
    }

}
