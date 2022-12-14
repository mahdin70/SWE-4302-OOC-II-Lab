import PreviousLabs.Lab5.Task2_MaxStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lab5_Task2_Test {
    @Test
    void test1(){
        Task2_MaxStack stack = new Task2_MaxStack();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);

        int expected = 5;
        int actual = stack.max();
        assertEquals(expected,actual);
    }

    @Test
    void test2(){
        Task2_MaxStack stack = new Task2_MaxStack();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.pop();

        int expected = 5;
        int actual = stack.max();
        assertEquals(expected,actual);
    }

}
