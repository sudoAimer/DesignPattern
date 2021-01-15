package sy4_1;

public class Admin extends User {

    @Override
    public void authority() {
        System.out.println("具有创建人事部门经理账号的权限");
    }
}
