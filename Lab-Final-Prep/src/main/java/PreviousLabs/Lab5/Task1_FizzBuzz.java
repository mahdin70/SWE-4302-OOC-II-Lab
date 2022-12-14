package PreviousLabs.Lab5;

public class Task1_FizzBuzz {
    public String getFizzBuzz(int number){
        if(number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }
        else if(number % 3 == 0){
            return "Fizz";
        }
        else if(number % 5 == 0){
            return "Buzz";
        }
        else{
            return "Boom";
        }
    }
}
