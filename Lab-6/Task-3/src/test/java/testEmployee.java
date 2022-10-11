import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testEmployee {
    @Test
    void test1(){
        Employee employee = new Employee("fulltime",1000,10);
        double exp1=33600.0;
        assertEquals(exp1,employee.YearlySalary());
    }
    @Test
    void test2(){
        Employee employee = new Employee("contractual",1000,10);
        double exp1=12000.0;
        assertEquals(exp1,employee.YearlySalary());
    }
    @Test
    void test3(){
        Employee employee = new Employee("Not Defined",1000,10);
        double exp1=5448.0;
        assertEquals(exp1,employee.YearlySalary());
    }

    @Test
    void test4(){
        Employee employee = new Employee("parttime",1000,10);
        double exp1=0;
        assertEquals(exp1,employee.YearlyLeaves());
    }

    @Test
    void test5(){
        Employee employee = new Employee("fulltime",1000,10);
        double exp1=10.5;
        assertEquals(exp1,employee.YearlyLeaves());
    }
    @Test
    void test6(){
        Employee employee = new Employee("Not Defined",1000,10);
        double exp1=15.0;
        assertEquals(exp1,employee.YearlyLeaves());
    }
}
