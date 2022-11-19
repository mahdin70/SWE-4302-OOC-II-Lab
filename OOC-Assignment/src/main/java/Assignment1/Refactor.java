package Assignment1;

public class Refactor {
    public int month;
    public int day;
    public int year;


    public void refactoredOperationMethod(int day, int month, int year){
        if(isLastDayOfMonth(day, month, year)){
            day = 1;
            month = month + 1;
        }
        else{
            day = day + 1;
        }
        if(isLastDayOfYear(day, month)){
            day = 1;
            month = 1;
            year = year + 1;
        }
    }
    private boolean isLastDayOfYear(int day, int month) {
        return (month == 12) && (day == 31);
    }

    private boolean isLastDayOfMonth(int day, int month,int year) {
        return (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && (day == 31) ||
                (month == 4 || month == 6 || month == 9 || month == 11) && day == 30 ||
                (month == 12) && (day == 31) ||
                (month == 2) && isLastDayOfFebruary(day, month) || (month == 2) && isLeapYear(year);
    }
    private boolean isLastDayOfFebruary(int day, int month) {
        return (month == 2) && (day == 29) || (day == 28);
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
