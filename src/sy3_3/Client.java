package sy3_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String args[])
    {
        Student s1, s2, s3, s4, s5;
        s1 = new Student("hqq", 21);
        s2 = new Student("cyq", 21);
        s3 = new Student("lyw", 20);
        s4 = new Student("lh", 18);
        s5 = new Student("yz", 22);
        StudentIterator si = new StudentIterator();
        si.addStudent(s1);
        si.addStudent(s2);
        si.addStudent(s3);
        si.addStudent(s4);
        si.addStudent(s5);
        si.display();
    }
}
