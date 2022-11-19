package Assignment2.DataCoupling;

public class Number {
    int number1 = 1;
    int number2 = 2;
    int number3 = 3;

    boolean allNumber = true;
    Printer printer = new Printer();
    public void Call(){
        printer.print(number1, number2, number3, allNumber);
    }
}
