package Task_2;


public class TripFactory {
    public ITrip choosevehicle (VehicleType type, int distanceKM, int timeMinutes, int numberOfPassengers) {
        ITrip vehicle;
        if(type.equals(VehicleType.SEDAN)) {
            vehicle = new SEDAN(distanceKM,timeMinutes,numberOfPassengers);
        }
        else if (type.equals(VehicleType.SEVEN_SEATER)) {
            vehicle = new SEVEN_SEATER(distanceKM,timeMinutes,numberOfPassengers);
        }
        else vehicle = new MOTOR_BIKE(distanceKM,timeMinutes,numberOfPassengers);
        return vehicle;
    }
}
