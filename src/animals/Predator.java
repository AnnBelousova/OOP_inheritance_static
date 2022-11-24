package animals;

import java.util.Objects;

public class Predator extends Mammals {
    private String typeOfEat;

    public Predator(String name, int age, String livingEnvironment, int movingSpeed, String typeOfEat) {
        super(name, age, livingEnvironment, movingSpeed);
        setTypeOfEat(typeOfEat);
    }

    public String getTypeOfEat() {
        return typeOfEat;
    }

    public void setTypeOfEat(String typeOfEat) {
        this.typeOfEat = typeOfEat!=null||!typeOfEat.isEmpty()||!typeOfEat.isBlank()?typeOfEat:"Meat";
    }

    @Override
    public void sleep() {
        System.out.println("Go to sleep.");
    }


    @Override
    public void eat() {
        System.out.println("Predatory animals feed on other animals.");
    }

    @Override
    public void move() {
        System.out.println("Predatory are moving very quickly.");
    }

    @Override
    public void walk() {
        System.out.println("Predatory like the walk.");
    }

    public void hunt() {
        System.out.println("Predatory animals, when chasing prey, move mainly forward or backward.");
    }
    public String toString() {
        return "Class predators: " + printAnimals() + printMammals() + ", type of eat is " + typeOfEat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predator predator = (Predator) o;
        return Objects.equals(typeOfEat, predator.typeOfEat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfEat);
    }
}
