import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

    public class Maintest {
        public static void main(String args[]) {

            Student s1 = new Student("5", "sai", 22);
            Student s2 = new Student("10", "vinay", 26);
            Student s3 = new Student("6", "lucky", 22);
            Student s4 = new Student("11", "vinay", 27);
            Student s5 = new Student("20", "saranya", 5);
            StudentSorter ss=new StudentSorter();
            ArrayList<Student> al = new ArrayList();
            al.add(s1);
            al.add(s2);
            al.add(s3);
            al.add(s4);
            al.add(s5);
            Collections.sort(al, ss);
            Iterator itr = al.iterator();
            while (itr.hasNext()) {
                Student s = (Student) itr.next();
                System.out.println(s.getStudent_id() + " " + s.getStudent_name() + " " + s.getStudent_age());
            }
        }
    }

