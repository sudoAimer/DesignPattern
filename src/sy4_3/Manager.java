package sy4_3;

public class Manager extends User {
    public Manager(){
        System.out.println("创建经理对象");
    }

    @Override
    public void diffOperation() {
        System.out.println("经理具有申请添加、删除员工，并提交人事部门批准确认。");
    }
}
