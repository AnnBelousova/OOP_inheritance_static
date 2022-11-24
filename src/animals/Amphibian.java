package animals;

import java.util.Objects;

public class Amphibian extends Animals{
    private String livingEnvironment;

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment!=null||!livingEnvironment.isEmpty()||!livingEnvironment.isBlank()?livingEnvironment:"inside water and on the ground.";
    }

    public Amphibian(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("Amphibian are eating insects.");
    }
    @Override
    public void move() {
        System.out.println("Amphibian can move under water and on the ground.");
    }
    public void hunt(){
        System.out.println("Amphibian hunt animals: insects, mollusks, worms");
    }
    @Override
    public String toString() {
        return "Class amphibians: " +  printAnimals() + ", livingEnvironment is " + livingEnvironment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(livingEnvironment, amphibian.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment);
    }
}
