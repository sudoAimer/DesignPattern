package sy4_4;

public class ConnectMethod {
    private String phone;//电话
    private String qq;//qq
    private String address;//地址
    ConnectMethod(String phone, String qq, String address){
        this.phone = phone;
        this.address = address;
        this.qq = qq;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
