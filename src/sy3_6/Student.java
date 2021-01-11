package sy3_6;

public class Student implements AbstractObserver {
    private String name;
    private int id;
    private String department;

    public Student(String name,int id,String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void show() {
        System.out.println("Name:" + this.name);
        System.out.println("Id:" + this.id);
        System.out.println("Department:" + this.department);
    }

    @Override
    public void response(String departmentName) {
        this.setDepartment(departmentName);
    }
}
