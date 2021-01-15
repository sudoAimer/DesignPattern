package sy4_1;

public class OtherManager extends User {
    @Override
    public void authority() {
        System.out.println("具有申请添加、删除员工，并提交人事部门批准确认的权限");
    }
}
