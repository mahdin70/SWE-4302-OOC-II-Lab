package PreviousLabs.Lab9;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.Name.compareTo(o2.Name);
    }
}

