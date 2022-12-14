package PreviousLabs.Lab10;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    String Name;
    String Designation;
    int Salary;
    List<String> Courses = new ArrayList<>();


    public Faculty(String Name, String Designation, int Salary, List<String> Courses){
        this.Name = Name;
        this.Designation = Designation;
        this.Salary = Salary;
        this.Courses = Courses;
    }
}
