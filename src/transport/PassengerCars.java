package transport;

public class PassengerCars extends Transport implements Competitive{
    public PassengerCars(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void beginMoving() {
        System.out.println("Passenger car starts to move");
    }

    @Override
    public void stopMoving() {
        System.out.println("Passenger car stopped.");
    }

    @Override
    public void pitStop() {
        System.out.println("This is method pit-stop from Passenger Car class.");
    }

    @Override
    public int bestCircleTime() {
        System.out.print("The best circle time of passenger car is ");
        return 2;
    }

    @Override
    public int maxSpeed() {
        System.out.print("The max speed of passenger car is ");
        return 210;
    }

}
