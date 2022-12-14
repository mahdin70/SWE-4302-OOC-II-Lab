package PreviousLabs.Lab5.Task3;

public class Student extends Person {
    public String major;
    public String year;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", major='" + major + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
