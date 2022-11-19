import org.junit.jupiter.api.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FacultyTest {
    @Test
    public void Test1(){
        Courses OOC = new Courses(4301,"OOC-2",3,Type.theory);
        Courses DBMS = new Courses(4308,"DBMS",2,Type.lab);

        Faculty F1 = new Faculty("Saidul Islam","Lecturer",50000, Arrays.asList("OOC", "DBMS"));
        Faculty F2 = new Faculty("ARMK","Professor",100000,Arrays.asList("DS","TOC"));

    }

    @Test
    public void ResearchMethod(){
        Object faculty = new Faculty("ARMK","Professor",100000,Arrays.asList("DS","TOC"));
        Method[] methods = faculty.getClass().getDeclaredMethods();
        List<String> actualMethods = new ArrayList<>();

        for(Method m:methods){
            boolean annotationIsPresent = m.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if(annotationIsPresent){
                actualMethods.add(m.getName());
            }
        }
        assertTrue(Arrays.asList("research").containsAll(actualMethods));
    }

    @Test
    public void TeachMethod(){
        Object faculty = new Faculty("ARMK","Professor",100000,Arrays.asList("DS","TOC"));
        Method[] methods = faculty.getClass().getDeclaredMethods();
        List<String> actualMethods = new ArrayList<>();

        for(Method m:methods){
            boolean annotationIsPresent = m.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if(annotationIsPresent){
                actualMethods.add(m.getName());
            }
        }
        assertTrue(Arrays.asList("teach").containsAll(actualMethods));
    }

    @Test
    public void ConstructorTest(){
        Object faculty = new Faculty("ARMK","Professor",100000,Arrays.asList("DS","TOC"));
        List<String> actualConstructor = new ArrayList<>();
        Constructor[] constructor = faculty.getClass().getDeclaredConstructors();
        for (Constructor m : constructor) {
            boolean annotationspresent = m.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if (annotationspresent) {
                actualConstructor.add(m.getName());
            }
        }
        assertTrue(Arrays.asList("Faculty").containsAll(actualConstructor));
    }

    @Test
    public void ClassTest(){
        Object faculty = new Faculty("ARMK","Professor",100000,Arrays.asList("DS","TOC"));
        Class<?> classes = faculty.getClass();
        Constructor[] constructors = faculty.getClass().getDeclaredConstructors();
        List<String> actualClass = new ArrayList<>();

        boolean annotationIsPresent = classes.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
        if(annotationIsPresent){
            actualClass.add(classes.getName());
        }
        assertTrue(Arrays.asList("Faculty").containsAll(actualClass));
    }
}
