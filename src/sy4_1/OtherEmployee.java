package sy4_1;

public class OtherEmployee extends User {

    @Override
    public void authority() {
        System.out.println("具有普通员工的权限");
    }
}
