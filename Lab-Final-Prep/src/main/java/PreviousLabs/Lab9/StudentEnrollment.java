package PreviousLabs.Lab9;

import java.util.ArrayList;

public class StudentEnrollment {
    ArrayList<Student> students = new ArrayList<Student>();

    public String getAll(){
        StringBuilder result = new StringBuilder();
        for (Student student : students) {
            result.append(student.StudentID).append(" ").append(student.Name).append(" ").append(student.Program).append(" ").append(student.CGPA);
        }
        return result.toString();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public void removeStudent(String ID){
        for (Student student : students) {
            if(student.StudentID.equals(ID)){
                students.remove(student);
                break;
            }
        }
    }

    public Student getStudent(String ID){
        for (Student student : students) {
            if(student.StudentID.equals(ID)){
                return student;
            }
        }
        return null;
    }

    public Student get(String ID){
        for (Student student : students) {
            if(student.StudentID.equals(ID)){
                return student;
            }
        }
        return null;
    }

    public void printList(){
        String list = this.getAll();
        System.out.println(list);
    }
}
