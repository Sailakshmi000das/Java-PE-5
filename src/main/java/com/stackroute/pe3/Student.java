public class Student{
    private String student_id;
    private String student_name;
    private int student_age;

    public Student(String student_id, String student_name, int student_age) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_age = student_age;
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public int getStudent_age() {
        return student_age;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public void setStudent_age(int student_age) {
        this.student_age = student_age;
    }
}

