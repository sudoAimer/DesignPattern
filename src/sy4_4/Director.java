package sy4_4;

import java.util.Date;

public class Director {//指挥者
    private UserBuilder userBuilder;
    public void setUserBuilder(UserBuilder userBuilder)
    {
        this.userBuilder = userBuilder;
    }
    public User construct(String phone, String qq, String address, String account, String password, boolean gender, String Department, Date date, Date loginTime, Integer level){
        userBuilder.buildConnectMethod(phone, qq, address);
        userBuilder.buildPersonalInformation(account,password,gender,Department,date,loginTime,level);
        return userBuilder.getUser();
    }
    Director(UserBuilder userBuilder){
        this.userBuilder = userBuilder;
    }
}
