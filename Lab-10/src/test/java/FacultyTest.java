import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FacultyTest {
    @Test
    public void TestMethod(){
        Courses OOC = new Courses(4301,"OOC-2",3,Type.theory);
        Courses DBMS = new Courses(4308,"DBMS",2,Type.lab);

        Faculty F1 = new Faculty("Saidul Islam","Lecturer",50000, Arrays.asList("OOC", "DBMS"));
        Faculty F2 = new Faculty("ARMK","Professor",100000,Arrays.asList("DS","TOC"));

    }

    @Test
    public void TestConstructor(){
        Faculty testFaculty = new Faculty("Samin Sadaf","Lecturer",20000);
        Courses testCourse = new Courses(4302,"TOC",3,Type.theory);

    }
}
