package Task2;

public class RentBook extends Book {
    int days;
    double BaseRent;

    public RentBook(String Title, String Author, int days, double BaseRent) {
        super(Title, Author);
        this.days = days;
        this.BaseRent = BaseRent;
    }
}
