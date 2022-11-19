package Assignment2.Independence;

public class Car {
    String name;
    int year;
    String color;
    String model;
    public Car(String name, int year, String color, String model){
        this.name = name;
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public void drive(){
        System.out.println("I am driving a " + this.name);
    }
}
