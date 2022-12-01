package transport;

public class Truck extends Transport implements Competitive{
    @Override
    public void beginMoving() {
        System.out.println("Track starts to move");
    }

    @Override
    public void stopMoving() {
        System.out.println("Track stopped.");
    }

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println("This is method pit-stop from Truck class.");
    }

    @Override
    public int bestCircleTime() {
        System.out.print("The best circle time of truck is ");
        return 6;
    }

    @Override
    public int maxSpeed() {
        System.out.print("The max speed of truck is ");
        return 120;
    }
}
