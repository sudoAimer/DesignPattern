    package sy4_3;

    public class Employee extends User {
        public Employee(){
            System.out.println("创建员工对象");
        }
        @Override
        public void diffOperation(){
            System.out.println("员工拥有商品管理、请假权限");
        }
    }
