package Task2;

public class NewBook implements RentCalculator {
    public double calculateRent(RentBook rentBook) {
        if(rentBook.days > 7) {
            return (rentBook.BaseRent + rentBook.BaseRent * 0.3) + ((rentBook.days - 7)*4);
        } else {
            return rentBook.BaseRent + rentBook.BaseRent * 0.3;
        }
    }
}

