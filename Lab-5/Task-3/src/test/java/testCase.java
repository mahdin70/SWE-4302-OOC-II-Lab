import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testCase {
    @Test
    void Test1(){
        Student students = new Student();
        students.name="Mukit";
        students.address="Gazipur";
        students.age="20";
        students.student_id="200042170";

        Faculty faculties= new Faculty();
        faculties.name="Nibir";
        faculties.address="Rampura";
        faculties.designation="Professor";
        faculties.age="40";

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(students);
        persons.add(faculties);

        String expected=
                "Student:Mukit 20 Gazipur 200042170\n" +
                "Faculty:Nibir 40 Rampura Professor\n";
        Printer printer = new Printer();
        assertEquals(expected,printer.printList(persons));
    }
}
