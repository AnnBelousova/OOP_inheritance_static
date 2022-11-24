package animals;

import java.util.Objects;

public class FlightlessBird extends Bird{
    private String typeOfMoving;

    public String getTypeOfMoving() {
        return typeOfMoving;
    }

    public FlightlessBird(String name, int age, String livingEnvironment, String typeOfMoving) {
        super(name, age, livingEnvironment);
        this.typeOfMoving = typeOfMoving!=null || !typeOfMoving.isEmpty()||!getTypeOfMoving().isBlank()?typeOfMoving:"Move on the ground.";
    }

    @Override
    public void eat() {
        System.out.println("The food of flightless birds will depend from living environment.");
    }

    @Override
    public void move() {
        System.out.println("The flightless birds move in the water and on the ground.");
    }

    @Override
    public void hunt() {
        System.out.println("The flightless bird such as penguin hunt the fish.");
    }
    public void walk(){
        System.out.println("The birds like the walk.");
    }

    @Override
    public String toString(){
        return "Class flightless bird: " + printAnimals() + printBird() + ", type of moving " + typeOfMoving;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightlessBird that = (FlightlessBird) o;
        return Objects.equals(typeOfMoving, that.typeOfMoving);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfMoving);
    }
}
