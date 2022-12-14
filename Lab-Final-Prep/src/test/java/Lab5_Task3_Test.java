import PreviousLabs.Lab5.Task3.Faculty;
import PreviousLabs.Lab5.Task3.Person;
import PreviousLabs.Lab5.Task3.Printer;
import PreviousLabs.Lab5.Task3.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lab5_Task3_Test {
    @Test
    void test1(){
        Student student = new Student();
        student.name = "John";
        student.age = "20";
        student.address = "123 Main St";
        student.major = "Computer Science";
        student.year = "Junior";

        Faculty faculty = new Faculty();
        faculty.name = "Jane";
        faculty.age = "30";
        faculty.address = "456 Main St";
        faculty.department = "Computer Science";
        faculty.office = "123";

        ArrayList<Person> list = new ArrayList<>();
        list.add(student);
        list.add(faculty);

        Printer printer = new Printer();

        String expected = "John 20 123 Main StJane 30 456 Main St";
        String actual = printer.printList(list);
        assertEquals(expected, actual);
    }
}
