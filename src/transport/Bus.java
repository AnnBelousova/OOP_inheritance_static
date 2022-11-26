package transport;

public class Bus extends Transport implements Competitive{
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void beginMoving() {
        System.out.println("Bus starts to move");
    }

    @Override
    public void stopMoving() {
        System.out.println("Bus stopped.");
    }

    @Override
    public void pitStop() {
        System.out.println("This is method pit-stop from Bus class.");
    }

    @Override
    public int bestCircleTime() {
        System.out.print("The best circle time of bus is ");
        return 11;
    }

    @Override
    public int maxSpeed() {
        System.out.print("The max speed of bus is ");
        return 100;
    }


    //    @Override
//    public void refill() {
//        System.out.println("Need to refill petrol/diesel");
//    }
//
//    public Bus(String brand, String model, int productionYear, String productionCountry, int maxSpeed) {
//        super(brand, model, productionYear, productionCountry, maxSpeed);
//    }
//
//    @Override
//    public String toString() {
//        return "Bus: " + super.toString();
//    }
}
