enum Program{
    SWE,
    CSE,
    IT
}
public class Student {
    public String Student_ID;
    public String Student_name;
    public Program Student_program;
    public float CGPA;
    public Student(String ID, String name, Program program, float cgpa) throws InvalidStudentIDException {
        setID(ID);
        this.CGPA=cgpa;
        this.Student_name=name;
        this.Student_program=program;
    }

    public void setID(String ID) throws InvalidStudentIDException{
        if(ID.length()!= 9){
            throw new InvalidStudentIDException("The Given Student ID is invalid");
        }
        this.Student_ID = ID;
    }

    public void Study(){
        System.out.print(this.Student_name+" "+"ID: "+ this.Student_ID + "studies");
    }

    public void Play(){
        System.out.print(this.Student_name+" "+"ID: "+ this.Student_ID + "plays");
    }
}