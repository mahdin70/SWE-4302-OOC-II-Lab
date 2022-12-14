package PreviousLabs.Lab3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = scanner.nextLine();

        try{
            if(str.length() <= 9 && str.contains("_")){
                System.out.println("OK");
            }
            else{
                throw new ArithmeticException();
            }
        }

        catch (ArithmeticException e){
            System.out.println("Not OK");
        }
    }
}
