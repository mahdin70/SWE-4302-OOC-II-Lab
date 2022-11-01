import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentEnrollmentTest {
    @Test
    public void StudentAddTest() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment =new StudentEnrollment();
        Student student= new Student("200042170","Mukit", Program.SWE, 3.56f);
        studentEnrollment.student_list.add(student);
        Student latest_student = studentEnrollment.student_list.get(studentEnrollment.student_list.size()-1);
        String latest_add = latest_student.Student_ID+latest_student.Student_name+latest_student.Student_program+latest_student.CGPA;
        assertEquals("200042170"+"Mukit"+"SWE"+"3.56", latest_add);
    }

    @Test
    public  void StudentRemoveTest() throws InvalidStudentIDException{
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        Student student= new Student("200042170","Mukit", Program.SWE, 3.54f);
        studentEnrollment.student_list.add(student);
        Student student1= new Student("200042102","Nibir", Program.SWE, 3.92f);
        studentEnrollment.student_list.add(student1);
        Student student2= new Student("200042116","Mamun", Program.SWE, 3.80f);
        studentEnrollment.student_list.add(student2);
        studentEnrollment.remove(student2);
        assertEquals(2,studentEnrollment.student_list.size());
        studentEnrollment.remove("200042170");
        assertEquals(1,studentEnrollment.student_list.size());
    }

    @Test
    public  void StudentgetAllTest() throws InvalidStudentIDException{
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        Student student= new Student("200042170","Mukit", Program.SWE, 3.54f);
        studentEnrollment.student_list.add(student);
        Student student1= new Student("200042102","Nibir", Program.SWE, 3.92f);
        studentEnrollment.student_list.add(student1);
        Student student2= new Student("200042116","Mamun", Program.SWE, 3.80f);
        studentEnrollment.student_list.add(student2);
        String getAllresult= studentEnrollment.getAll();
        assertEquals("200042170 Mukit SWE 3.54\n" +
                "200042102 Nibir SWE 3.92\n" +
                "200042116 Mamun SWE 3.8\n",getAllresult);
    }

    @Test
    public void StudentGetTest() throws InvalidStudentIDException{

        StudentEnrollment studentEnrollment=new StudentEnrollment();
        Student student= new Student("200042170","Mukit", Program.SWE, 3.54f);
        studentEnrollment.student_list.add(student);
        Student student1= new Student("200042102","Nibir", Program.SWE, 3.92f);
        studentEnrollment.student_list.add(student1);
        Student student2= new Student("200042116","Mamun", Program.SWE, 3.80f);
        studentEnrollment.student_list.add(student2);
        String ID = student2.Student_ID;
        assertEquals("200042116",ID);
        String ID2 = student1.Student_ID;
        assertEquals("200042102",ID2);
    }
}
