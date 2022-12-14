package PreviousLabs.Lab10;

enum Type{
    theory,
    lab
};

public class Courses {
    int Code;
    String Name;
    int Credit;
    Type Type;

    public Courses(int Code, String Name, int Credit, Type Type){
        this.Code = Code;
        this.Name = Name;
        this.Credit = Credit;
        this.Type = Type;
    }
}
