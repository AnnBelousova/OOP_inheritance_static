package transport;

public class Mechanic {
    public enum TypeAutoToServe {
        UNIQUE_MECHANIC,
        BUS_MECHANIC,
        TRUCK_MECHANIC,
        CAR_MECHANIC;

    }

    private String fullName;
    private String companyName;
    public String autoTypeToWork;

    public String getAutoTypeToWork() {
        return autoTypeToWork;
    }

    public void setAutoTypeToWork(String autoTypeToWork) {
        this.autoTypeToWork = autoTypeToWork;
    }

    Transport transport;
    TypeAutoToServe typeAutoToServe;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Mechanic(String fullName, String companyName, TypeAutoToServe typeAutoToServe) {
        this.fullName = fullName;
        this.companyName = companyName;
        this.typeAutoToServe = typeAutoToServe;
    }

    public void doTransportService() {
        switch (typeAutoToServe) {
            case CAR_MECHANIC:
                System.out.println("Passenger Car");
                break;
            case BUS_MECHANIC:
                System.out.println("Bus");
                break;
            case TRUCK_MECHANIC:
                System.out.println("Truck");
                break;
            case UNIQUE_MECHANIC:
                System.out.println("PassengerCars + Bus + Truck");
                break;
        }
    }

    public void repairTransport() {
        System.out.println(getFullName() + " will repair your car");
    }

    public Mechanic(String fullName, String companyName) {
        this.fullName = fullName;
        this.companyName = companyName;
    }
}
