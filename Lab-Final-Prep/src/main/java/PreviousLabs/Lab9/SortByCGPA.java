package PreviousLabs.Lab9;

import PreviousLabs.Lab5.Task3.Faculty;

import java.util.Comparator;

public class SortByCGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o1.CGPA, o2.CGPA);
    }
}

