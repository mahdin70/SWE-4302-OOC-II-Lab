package PreviousLabs.Lab9;

import java.util.Comparator;

public class SortByID implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.StudentID.compareTo(o2.StudentID);
    }
}
