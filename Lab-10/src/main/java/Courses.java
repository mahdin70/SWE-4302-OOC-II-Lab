enum Type{
    theory,
    lab
};

public class Courses {
    int Code;
    String Name;
    int Credit;
    Type type;

    public Courses(int code, String name, int credit, Type type) {
        Code = code;
        Name = name;
        Credit = credit;
        this.type = type;
    }
}
