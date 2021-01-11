package sy3_3;
public class Student implements Comparable<Student> {
    private String name;
    private int id;

    public Student(String name,int id) {
        super();
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        return (this.id > o.id) ? -1 : 1;
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
}
