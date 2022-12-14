package Task1.A;

public class Computer {
    String Name;
    String Manufacturer;
    String Processor;
    int RAM;
    int Storage;
    double Price;

    public Computer(String Name, String Manufacturer, String Processor, int RAM, int Storage, double Price){
        this.Name = Name;
        this.Manufacturer = Manufacturer;
        this.Processor = Processor;
        this.RAM = RAM;
        this.Storage = Storage;
        this.Price = Price;
    }


    //Here "hasSamePrice" method is created to compare the price of two computers

    void hasSamePrice(Computer c1, Computer c2){
        if(c1.Price == c2.Price){
            System.out.println("The two computers have the same price.");
        }
        else{
            System.out.println("The two computers have different prices.");
        }
    }
}
