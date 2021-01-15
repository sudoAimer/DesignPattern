package sy4_3;

public class Admin extends User {
    public Admin(){
        System.out.println("创建管理员对象");
    }
    @Override
    public void diffOperation(){
        System.out.println("具有创建人事部门经理账号权限");
    }
}
