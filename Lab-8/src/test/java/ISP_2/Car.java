package ISP_2;

public class Car implements CameraSwitch,EngineSwitch,RadioSwitch {
    @Override
    public void TurnOnCamera() {
        System.out.println("Turning On Camera");
    }

    @Override
    public void TurnOffCamera() {
        System.out.println("Turning Off Camera");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Engine");
    }

    @Override
    public void TurnOnRadio() {
        System.out.println("Turning On Radio");

    }

    @Override
    public void TurnOffRadio() {
        System.out.println("Turning Off Radio");
    }
}
