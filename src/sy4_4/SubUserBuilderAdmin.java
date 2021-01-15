package sy4_4;

import java.util.Date;

public class SubUserBuilderAdmin extends UserBuilder {//管理员用户建造方法
    @Override
    public void buildConnectMethod(String phone, String qq, String address) {
        user.setConnectMethod(new ConnectMethod(null,null,null));//管理员应该是都没有的
    }

    @Override
    public void buildPersonalInformation(String account, String password, boolean gender, String Department, Date date, Date loginTime, Integer level) {
        user.setPersonalInformation(new PersonalInformation("admin","123456",false,null,null,null,0));
    }
}
