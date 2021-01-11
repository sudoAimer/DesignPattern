package sy3_6;

public class Client {
    public static void main(String args[]) {
        AbstractSchool dep = new Department("Computer Science");

        AbstractObserver to,so;
        to = new Teacher("WJS",214,dep.getName());
        so = new Student("HQQ",117,dep.getName());

        dep.attach(to);
        dep.attach(so);

        to.show();
        so.show();

        System.out.println("更改系名为Data Science");
        dep.changeName("Data Science");
        to.show();
        so.show();
    }
}
