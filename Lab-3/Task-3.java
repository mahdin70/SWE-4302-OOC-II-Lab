package com.Mukit.ExceptionHandling;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a string(DONE to quit): ");
        String input = myScan.nextLine();
        try{

            if(input.length() <= 9 && input.contains("_")) {
                System.out.println("OK");
            }
            else{
                throw new ArithmeticException();
            }
        }
        catch(ArithmeticException e){
                System.out.println ("NOT OK");
            }
        }
}

