public class Employee {
    private final String EmployeeTime;
    private final int BaseSalary;
    private final int DaysWorked;

    public Employee(String EmployeeTime,int BaseSalary,int DaysWorked){
        this.BaseSalary=BaseSalary;
        this.EmployeeTime=EmployeeTime;
        this.DaysWorked=DaysWorked;
    }

    public double YearlySalary(){
        switch (EmployeeTime) {
            case "fulltime" -> {
                return 12 * (BaseSalary + BaseSalary * 0.6 + BaseSalary * 1.2);
            }
            case "contractual" -> {
                return 12 * (BaseSalary);
            }
            default -> {
                return 12 * ((BaseSalary * DaysWorked) / 22);
            }
        }
    }

    public double YearlyLeaves(){
        switch (EmployeeTime){
            case "parttime": {
                return 0;
            }
            case "fulltime": {
                return 10+(DaysWorked*0.05);
            }
            default: {
                return 15;
            }
        }
    }
}
