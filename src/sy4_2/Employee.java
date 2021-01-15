package sy4_2;

public class Employee extends AbstractElement{
    private String Name;
    private String No;

    @Override
    void GetInformation()//个人信息
    {
        System.out.println("Name:" + Name + " No: " + No);
    }
    Employee(String name,String no){
        this.Name = name;
        this.No = no;
    }
}
