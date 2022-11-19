package Assignment2.Independence;

public class Engine {
    String name;
    int cc;
    int hp;
    public Engine(String name, int cc, int hp){
        this.name = name;
        this.cc = cc;
        this.hp = hp;
    }

    public void engineAttributes(){
        System.out.println("The engine is a " + this.name + " with " + this.cc + " cc and " + this.hp + " hp");
    }
}
