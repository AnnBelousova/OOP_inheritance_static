package transport;

public abstract class Transport {
     private final String brand;
     private final String model;
     private final int productionYear;
     private final String productionCountry;
     private String color;
     private int maxSpeed;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(!color.isEmpty() || !color.isBlank() || color != null){
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed != 0){
            this.maxSpeed = maxSpeed;
        }
    }

    public abstract void refill();
    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        this.brand = brand!=null || !brand.isEmpty() || !brand.isBlank()?brand:"Info not provided";
        this.model = model!=null || !model.isBlank() || !model.isEmpty()?model:"Info not provided";
        this.productionYear = productionYear!=0?productionYear: Integer.parseInt("Info not provided");
        this.productionCountry = productionCountry!=null || !productionCountry.isEmpty() || !productionCountry.isBlank()?productionCountry:"Info not provided";
        setColor(color);
        setMaxSpeed(maxSpeed);
    }
    public Transport(String brand, String model, int productionYear, String productionCountry, int maxSpeed) {
        this.brand = brand!=null || !brand.isEmpty() || !brand.isBlank()?brand:"Info not provided";
        this.model = model!=null || !model.isBlank() || !model.isEmpty()?model:"Info not provided";
        this.productionYear = productionYear!=0?productionYear: Integer.parseInt("Info not provided");
        this.productionCountry = productionCountry!=null || !productionCountry.isEmpty() || !productionCountry.isBlank()?productionCountry:"Info not provided";
        setMaxSpeed(maxSpeed);
    }

    @Override
    public String toString() {
        return "Brand " + brand+
                ", model" + model +
                ", production Year" + productionYear +
                ", production Country " + productionCountry +
                ", color" + color +
                ", max Speed" + maxSpeed;
    }
}
