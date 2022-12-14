import PreviousLabs.Lab6.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lab6_Test {
    @Test
    void test1(){
        Employee e1 = new Employee("FullTime", 10000, 22);
        double expected = 12 * (10000 + 10000 * 0.6 + 10000 * 1.2);
        double actual = e1.YearlySalary();
        assertEquals(expected, actual);
    }

    @Test
    void test2(){
        Employee e1 = new Employee("Contractual", 10000, 22);
        double expected = 12 * 10000;
        double actual = e1.YearlySalary();
        assertEquals(expected, actual);
    }

    @Test
    void test3(){
        Employee e1 = new Employee("PartTime", 10000, 22);
        double expected = 12 * ((10000 * 22) / 22);
        double actual = e1.YearlySalary();
        assertEquals(expected, actual);
    }
}
