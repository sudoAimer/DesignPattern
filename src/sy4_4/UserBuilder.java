package sy4_4;

import java.util.Date;

public abstract class UserBuilder {
    protected User user = new User();

    public abstract void buildConnectMethod(String phone,String qq,String address);
    public abstract void buildPersonalInformation(String account,String password,boolean gender,String Department,
                                                  Date date,Date loginTime,Integer level);

    public User getUser()
    {
        return user;
    }
}
