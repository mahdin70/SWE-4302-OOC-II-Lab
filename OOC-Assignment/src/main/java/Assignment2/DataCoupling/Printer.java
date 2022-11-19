package Assignment2.DataCoupling;

public class Printer {
    public void print(int number1, int number2, int number3, boolean allNumber){
        if(allNumber){
            System.out.println(number1 + " " + number2 + " " + number3);
        }
        System.out.println("All Number ?" + allNumber);
    }
}
