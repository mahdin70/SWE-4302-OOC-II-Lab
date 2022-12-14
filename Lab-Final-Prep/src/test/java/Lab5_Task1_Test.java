import PreviousLabs.Lab5.Task1_FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lab5_Task1_Test {
    @Test
    void testFizzBuzz(){
        Task1_FizzBuzz task1 = new Task1_FizzBuzz();
        String expected = "FizzBuzz";
        String actual = task1.getFizzBuzz(15);
        assertEquals(expected,actual);
    }

    @Test
    void testFizz(){
        Task1_FizzBuzz task1 = new Task1_FizzBuzz();
        String expected = "Fizz";
        String actual = task1.getFizzBuzz(3);
        assertEquals(expected,actual);
    }

    @Test
    void testBuzz(){
        Task1_FizzBuzz task1 = new Task1_FizzBuzz();
        String expected = "Buzz";
        String actual = task1.getFizzBuzz(5);
        assertEquals(expected,actual);
    }

    @Test
    void testBoom(){
        Task1_FizzBuzz task1 = new Task1_FizzBuzz();
        String expected = "Boom";
        String actual = task1.getFizzBuzz(2);
        assertEquals(expected,actual);
    }
}
