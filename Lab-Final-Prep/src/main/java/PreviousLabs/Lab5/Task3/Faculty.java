package PreviousLabs.Lab5.Task3;

public class Faculty extends Person {
    public String department;
    public String office;

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                ", office='" + office + '\'' +
                '}';
    }
}
