package sy4_2;

public class Client {
    public static void main(String[] args) {
        Employee zhangsan,lisi,wangwu;//人
        Department personal;//人事部
        zhangsan = new Employee("zhangsan","1");
        lisi = new Employee("lisi    ","2");
        wangwu = new Employee("wangwu  ","3");
        personal = new Department();
        personal.add(zhangsan);
        personal.add(lisi);
        personal.add(wangwu);

        System.out.println("查看所有人事部同事：");
        personal.getAll();//输出
    }
}
