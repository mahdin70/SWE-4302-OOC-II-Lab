import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultPublicationTest {
    @Test
    public void sortbyIDtest() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        Student student= new Student("200042170","Mukit", Program.SWE, 3.54f);
        studentEnrollment.student_list.add(student);
        Student student1= new Student("200042102","Nibir", Program.SWE, 3.92f);
        studentEnrollment.student_list.add(student1);
        Student student2= new Student("200042116","Mamun", Program.SWE, 3.80f);
        studentEnrollment.student_list.add(student2);

        ResultPublication resultPublication=new ResultPublication();
        resultPublication.publish("ID",studentEnrollment);
        String result=studentEnrollment.getAll();
        assertEquals("200042116 Mamun SWE 3.8\n" +
                "200042102 Nibir SWE 3.92\n" +
                "200042170 Mukit SWE 3.54\n",result);
    }


    @Test
    public void sortbyNametest() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        Student student= new Student("200042170","Mukit", Program.SWE, 3.54f);
        studentEnrollment.student_list.add(student);
        Student student1= new Student("200042102","Nibir", Program.SWE, 3.92f);
        studentEnrollment.student_list.add(student1);
        Student student2= new Student("200042116","Mamun", Program.SWE, 3.80f);
        studentEnrollment.student_list.add(student2);
        ResultPublication resultPublication=new ResultPublication();
        resultPublication.publish("Name",studentEnrollment);
        String result=studentEnrollment.getAll();
        assertEquals("200042116 Mamun SWE 3.8\n" +
                "200042170 Mukit SWE 3.54\n" +
                "200042102 Nibir SWE 3.92\n",result);
    }


    @Test
    public void sortbyCGPAtest() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        Student student= new Student("200042170","Mukit", Program.SWE, 3.54f);
        studentEnrollment.student_list.add(student);
        Student student1= new Student("200042102","Nibir", Program.SWE, 3.92f);
        studentEnrollment.student_list.add(student1);
        Student student2= new Student("200042116","Mamun", Program.SWE, 3.80f);
        studentEnrollment.student_list.add(student2);
        ResultPublication resultPublication=new ResultPublication();
        resultPublication.publish("CGPA",studentEnrollment);
        String result=studentEnrollment.getAll();
        assertEquals("200042170 Mukit SWE 3.54\n" +
                "200042116 Mamun SWE 3.8\n" +
                "200042102 Nibir SWE 3.92\n",result);
    }
    @Test
    public void sortbyCGPAandIDtest() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        Student student= new Student("200042170","Mukit", Program.SWE, 3.54f);
        studentEnrollment.student_list.add(student);
        Student student1= new Student("200042102","Nibir", Program.SWE, 3.92f);
        studentEnrollment.student_list.add(student1);
        Student student2= new Student("200042116","Mamun", Program.SWE, 3.80f);
        studentEnrollment.student_list.add(student2);
        ResultPublication resultPublication=new ResultPublication();
        resultPublication.publish("CGPA","ID",studentEnrollment);
        String result=studentEnrollment.getAll();
        assertEquals("200042116 Mamun SWE 3.8\n" +
                "200042102 Nibir SWE 3.92\n" +
                "200042170 Mukit SWE 3.54\n",result);
    }
}
