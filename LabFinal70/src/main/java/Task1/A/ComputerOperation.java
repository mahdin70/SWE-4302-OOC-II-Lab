package Task1.A;

// To use Computer Object, a separate computer Class is created in the package Task1
// The ComputerOperation class is implementing the PlugIn, ShutDown, Hibernate Interface to use the Computer Object
public class ComputerOperation implements Hibernate, PlugIn, ShutDown {
    Computer computer1 = new Computer("Dell", "Dell", "Intel", 8, 500, 50000);
    Computer computer2 = new Computer("HP", "HP", "AMD", 16, 1000, 100000);

    @Override
    public void hibernate(Computer c) {
        System.out.println("Computer is hibernating");
    }

    @Override
    public void plugIn(Computer c) {
        System.out.println("Computer is plugged in");
    }

    @Override
    public void shutDown(Computer c) {
        System.out.println("Computer is shutting down");
    }
}
