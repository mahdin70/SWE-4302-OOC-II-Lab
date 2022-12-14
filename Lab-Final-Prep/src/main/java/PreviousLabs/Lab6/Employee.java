package PreviousLabs.Lab6;

public class Employee {
    private String EmplyeeType;
    private int BaseSalary;
    private int DaysWorked;

    public Employee(String EmplyeeType, int BaseSalary, int DaysWorked) {
        this.EmplyeeType = EmplyeeType;
        this.BaseSalary = BaseSalary;
        this.DaysWorked = DaysWorked;
    }

    public double YearlySalary(){
        switch (EmplyeeType){
            case "FullTime": {
                return 12 * (BaseSalary + BaseSalary * 0.6 + BaseSalary * 1.2);
            }
            case "Contractual": {
                return 12 * BaseSalary;
            }
            default: {
                return 12 * ((BaseSalary * DaysWorked) / 22);
            }
        }
    }

    public double YearlyLeaves(){
        switch (EmplyeeType){
            case "PartTime": {
                return 0;
            }
            case "FullTime": {
                return 10 + (DaysWorked * 0.05);
            }
            default: {
                return 15;
            }
        }
    }
}
