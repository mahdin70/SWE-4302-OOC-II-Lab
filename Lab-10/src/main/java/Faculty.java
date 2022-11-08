import java.sql.Array;
import java.util.*;

@DevelopmmentHistory(Version = 1,Developer="Mukit",Tester="Nibir")
public class Faculty {
    String Name;
    String Designation;
    int Salary;
    List<String> Courses = new ArrayList<>();

    @DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmmentHistory(Developer = "Mukit"),Reviewer = {"Muaz","Nibir","Mamun"})
    public Faculty(String name, String designation, int salary, List<String> courses) {
        Name = name;
        Designation = designation;
        Salary = salary;
        Courses = courses;
    }

    @DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmmentHistory(Developer = "Mukit"),Reviewer = {"Mamun"})
    public Faculty(String name, String designation, int salary) {
        Name = name;
        Designation = designation;
        Salary = salary;
    }

    @DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmmentHistory(Developer = "Mukit"),Reviewer = {"Nibir"})
    public <Courses> void teach(Courses courses){
        System.out.println(this.Name+ " teaches " + courses);
    }

    @DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmmentHistory(Developer = "Mukit"),Reviewer = {"Muaz"})
    public void research(String topic){
        System.out.println(this.Name + " doing research on "+ topic);
    }
}
