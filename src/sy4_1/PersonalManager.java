package sy4_1;

public class PersonalManager extends User {
    @Override
    public void authority() {
        System.out.println("具有添加、删除其他部门经理账号，也可以批准添加、删除其他类型普通员工的权限");
    }
}
