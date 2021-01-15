package sy4_4;

import java.util.Date;

public class SubUserBuilderOrdinary extends UserBuilder {


    @Override
    public void buildConnectMethod(String phone, String qq, String address) {
        user.setConnectMethod(new ConnectMethod(phone,qq,address));
    }

    @Override
    public void buildPersonalInformation(String account, String password, boolean gender, String Department, Date date, Date loginTime, Integer level) {
        user.setPersonalInformation(new PersonalInformation(account,password,gender,Department,date,loginTime,level));
    }//普通用户建造方法
}
