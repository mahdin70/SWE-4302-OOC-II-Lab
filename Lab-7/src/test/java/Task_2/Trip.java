package Task_2;

public class Trip {
    private ITrip type;

    public Trip(VehicleType vehicleType,
                int distanceKM,
                int timeMinutes,
                int numberOfPassengers) {
        TripFactory tf = new TripFactory();
        this.type = tf.choosevehicle(vehicleType, distanceKM, timeMinutes, numberOfPassengers);
    }

    public int perHeadFare()
    {
        int fare = -1;
        fare = type.perHeadFare();

        return fare - (fare % 5);
    }

    public boolean canTakeTrip()
    {
        return type.canTakeTrip();
    }
}
