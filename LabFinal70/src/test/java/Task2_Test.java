import Task2.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2_Test {
    @Test
    public void TestCalculateKidsBookRentWithFine() {
        RentBook rentBook = new RentBook("A Fairy Tale", "Mr X", 10, 10.0);
        RentCalculator rentCalculator = new KidsBook();
        double result = 21.0;
        double actual = rentCalculator.calculateRent(rentBook);
        assertEquals(result, actual);
    }

    @Test
    public void TestCalculateKidsBookRentWithoutFine(){
        RentBook rentBook = new RentBook("Ekta Shei Kahini","Mukit",5,10.0);
        RentCalculator rentCalculator = new KidsBook();
        double result = 9.0;
        double actual = rentCalculator.calculateRent(rentBook);
        assertEquals(result,actual);
    }
    @Test
    public void TestCalculateRegularBookRentWithFine(){
        RentBook rentBook = new RentBook("Ekta Shei Journey","Mahdin",10,20.0);
        RentCalculator rentCalculator = new RegularBook();
        double result = 28.0;
        double actual = rentCalculator.calculateRent(rentBook);
        assertEquals(result,actual);
    }

    @Test
    public void TestCalculateRegularBookRentWithoutFine() {
        RentBook rentBook = new RentBook("A Good Journey", "Mr Y", 5, 20.0);
        RentCalculator rentCalculator = new RegularBook();
        double result = 16.0;
        double actual = rentCalculator.calculateRent(rentBook);
        assertEquals(result, actual);
    }


    @Test
    public void TestCalculateNewBookRentWithFine(){
        RentBook rentBook = new RentBook("A New Book","Mr Z",10,30.0);
        RentCalculator rentCalculator = new NewBook();
        double result = 51.0;
        double actual = rentCalculator.calculateRent(rentBook);
        assertEquals(result,actual);
    }

    @Test
    public void TestCalculateNewBookRentWithoutFine(){
        RentBook rentBook = new RentBook("Ekta Notun Boi","Mukit Mahdin",7,30.0);
        RentCalculator rentCalculator = new NewBook();
        double result = 39.0;
        double actual = rentCalculator.calculateRent(rentBook);
        assertEquals(result,actual);
    }
}
