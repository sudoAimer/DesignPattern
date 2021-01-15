package sy4_4;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        UserBuilder userBuilder = (UserBuilder) new SubUserBuilderOrdinary();
        Director director = new Director(userBuilder);
        User user  =  new User();
        user = director.construct("123456", "123456", "ncu","zhangsan", "66668888", true, "IE",null, null, null);
        System.out.println("成员信息如下：");
        System.out.println("account:   " + user.getPersonalInformation().getAccount());
        System.out.println("password:  " + user.getPersonalInformation().getPassword());
        System.out.println("Department:" + user.getPersonalInformation().getDepartment());
        System.out.println("address:   " + user.getConnectMethod().getAddress());
        System.out.println("qq:        " + user.getConnectMethod().getQq());
        System.out.println("phone:     " + user.getConnectMethod().getPhone());
    }
}
