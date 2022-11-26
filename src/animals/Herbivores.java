package animals;

import java.util.Objects;

public class Herbivores extends Mammals{
    private String typeOfEat;

    public String getTypeOfEat() {
        return typeOfEat;
    }

    public void setTypeOfEat(String typeOfEat) {
        this.typeOfEat = typeOfEat!=null || !typeOfEat.isEmpty() || !typeOfEat.isBlank()?typeOfEat:"Grass.";
    }

    public Herbivores(String name, int age, String livingEnvironment, int movingSpeed, String typeOfEat) {
        super(name, age, livingEnvironment, movingSpeed);
        setTypeOfEat(typeOfEat);
    }

    @Override
    public void sleep() {
        System.out.println("Go to sleep.");
    }

    @Override
    public void eat() {
        System.out.println("Herbivores eat the grass.");
    }

    @Override
    public void move() {
        System.out.println("Most herbivore species live in forests, meadows, wastelands and wetlands");
    }

    @Override
    public void walk() {
        super.walk();
    }
    public void pasture(){
        System.out.println("herbivores graze on pasture.");
    }

    @Override
    public String toString() {
        return "Class herbivores: " +  printAnimals() + printMammals() + ", type of eat is " + typeOfEat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfEat, that.typeOfEat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfEat);
    }
}
