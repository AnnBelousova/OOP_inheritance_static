package transport;

public class Bus extends Transport {

    @Override
    public void refill() {
        System.out.println("Need to refill petrol/diesel");
    }

    public Bus(String brand, String model, int productionYear, String productionCountry, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, maxSpeed);
    }

    @Override
    public String toString() {
        return "Bus: " + super.toString();
    }
}
