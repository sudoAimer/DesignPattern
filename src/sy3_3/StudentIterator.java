package sy3_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class StudentIterator {
    private List<Student> stuList = new ArrayList<Student>();
    public void addStudent(Student student) {
        stuList.add(student);
    }

    public void display() {
        Collections.sort(stuList);
        Iterator<Student> sit = stuList.iterator();
        while(sit.hasNext()) {
            Student student = sit.next();
            System.out.println("No: " + student.getId() + "  Name: " + student.getName());
        }

    }
}
