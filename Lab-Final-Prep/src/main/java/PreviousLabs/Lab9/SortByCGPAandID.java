package PreviousLabs.Lab9;

import java.util.Comparator;

public class SortByCGPAandID implements Comparator<Student> {
    SortByID sortByID = new SortByID();
    SortByCGPA sortByCGPA = new SortByCGPA();

    @Override
    public int compare(Student o1, Student o2) {
        int compareCGPA = sortByCGPA.compare(o1, o2);
        int compareID = sortByID.compare(o1, o2);

        return compareCGPA == 0 ? compareCGPA : compareID;
    }
}
