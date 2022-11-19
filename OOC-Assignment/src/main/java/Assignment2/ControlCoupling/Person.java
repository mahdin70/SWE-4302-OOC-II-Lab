package Assignment2.ControlCoupling;

public class Person {
    public void printerMethod(String p){
        if(p.equals("Mukit")){
            PrintMukit printer = new PrintMukit();
            printer.print();
        }
        else{
            PrintPerson printer = new PrintPerson();
            printer.print();
        }
    }
}
