
public class Student extends Person{
    public String student_id;
    @Override
    public String toString() {
        return "Student:"+name+" "+age+" "+address+" "+student_id;
    }
}
