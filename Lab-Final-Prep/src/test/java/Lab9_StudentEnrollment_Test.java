import PreviousLabs.Lab9.Program;
import PreviousLabs.Lab9.Student;
import PreviousLabs.Lab9.StudentEnrollment;
import org.junit.jupiter.api.Test;

public class Lab9_StudentEnrollment_Test {
    @Test
    public void StudentAddTest(){
        StudentEnrollment studentEnrollment = new StudentEnrollment();
        Student student = new Student("1","Mukit", Program.CSE,3.5f);
        studentEnrollment.addStudent(student);


        Student latest_student = studentEnrollment.getStudent("1");
    }
}
