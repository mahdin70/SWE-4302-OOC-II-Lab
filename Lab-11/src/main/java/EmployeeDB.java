import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDB {

    //Another save employee method
    public void saveEmployee(Employee employee) {
        FileWriter fw  = null;
        try {
            fw = new FileWriter("E:\\Software-Engineering-Study\\3rd-Semester\\Labs\\OOC-II-Lab\\SWE-4302-OOC-II-Lab\\Lab-11\\employee.txt", true);
            fw.write(employee.getID() + "," + employee.getAge() + "," + employee.getSalary() +'\n');
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                fw.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    /*Pure Function*/
    public List<Employee> getEmployeeList(){
        List<Employee> employeeList = new ArrayList<>();
        Scanner sc = null;
        try {
            sc = new Scanner(new File("E:\\Software-Engineering-Study\\3rd-Semester\\Labs\\OOC-II-Lab\\SWE-4302-OOC-II-Lab\\Lab-11\\employee.txt"));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] tokens = line.split(",");
                Employee employee = new Employee();
                employee.setID(tokens[0]);
                employee.setAge(Integer.parseInt(tokens[1]));
                employee.setSalary(Integer.parseInt(tokens[2]));
                employeeList.add(employee);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                sc.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return employeeList;
    }



    /*The Following function is a imPure Function because it does not change the state of the object and
    it does not have any side effects. */

    public List<Employee> addEmployee(List<Employee> employees,Employee employee){
        employees.add(employee);
        return employees;
    }


    /*Pure Function*/
    /*The Following function is a Pure Function because it does not change the state of the object*/
    public List<Employee> ageFilter(List<Employee> employees, int age){
        List<Employee> agefilter = new ArrayList<>();
        employees.forEach(employee -> {
            if(employee.getAge() > age){
                agefilter.add(employee);
            }
        });
        return agefilter;
    }


    /*Pure Function*/
    public List<Employee> salaryFilter(List<Employee> employees,int salary){
        List<Employee> filteredEmployees = new ArrayList<>();
        employees.forEach(employee -> {
            if(employee.getSalary() > salary){
                filteredEmployees.add(employee);
            }
        });
        return filteredEmployees;
    }

}
