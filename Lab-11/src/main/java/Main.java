import java.util.List;

public class Main {
    public static void main(String[] args){
        EmployeeDB employeeDB = new EmployeeDB();

        Employee employee = new Employee();
        employee.setID("1");
        employee.setAge(20);
        employee.setSalary(1000);
        employeeDB.saveEmployee(employee);

        Employee employee1 = new Employee();
        employee1.setID("2");
        employee1.setAge(25);
        employee1.setSalary(2000);
        employeeDB.saveEmployee(employee1);

        Employee employee2 = new Employee();
        employee2.setID("3");
        employee2.setAge(30);
        employee2.setSalary(3000);
        employeeDB.saveEmployee(employee2);

        List<Employee> employeeList = employeeDB.getEmployeeList();

        employeeList = employeeDB.addEmployee(employeeList,employee);
        employeeList = employeeDB.addEmployee(employeeList,employee1);
        employeeList = employeeDB.addEmployee(employeeList,employee2);

        System.out.println("Total Employee List");
        for(Employee e : employeeList){
            System.out.println(e.getID() + " " + e.getAge() + " " + e.getSalary());
        }

        System.out.println("Printing Age Filtered Result");
        List<Employee> agefilter = employeeDB.ageFilter(employeeList, 20);
        for(Employee employees : agefilter) {
            System.out.println(employees.getID()+" "+employees.getAge()+" "+employees.getSalary());
        }

        System.out.println("Printing Salary Filtered Result");
        List<Employee> salaryfilter = employeeDB.salaryFilter(employeeList, 2000);
        for(Employee employees : salaryfilter) {
            System.out.println(employees.getID()+" "+employees.getSalary());
        }
    }
}
