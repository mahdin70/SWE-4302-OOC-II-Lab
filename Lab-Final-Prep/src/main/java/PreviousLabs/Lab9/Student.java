package PreviousLabs.Lab9;

public class Student {
    public String StudentID;
    public String Name;
    public Program Program;
    public float CGPA;

    public Student(String StudentID, String Name, Program Program, float CGPA) {
        this.StudentID = StudentID;
        this.Name = Name;
        this.Program = Program;
        this.CGPA = CGPA;
    }

    public void setID(String ID) throws Exception{
        if(ID.length()!=9){
            throw new Exception("Invalid ID");
        }
        this.StudentID = ID;
    }

    public void study(){
        System.out.println("Studying");
    }

    public void play(){
        System.out.println("Playing");
    }
}
