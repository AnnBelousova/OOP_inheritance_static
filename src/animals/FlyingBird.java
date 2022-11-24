package animals;

import java.util.Objects;

public class FlyingBird extends Bird{
    private String typeOfMoving;
    public String getTypeOfMoving() {
        return typeOfMoving;
    }

    @Override
    public void eat() {
        System.out.println("Some birds each the vegetable food and some - meat/fish.");
    }

    @Override
    public void move() {
        System.out.println("Birds fly very quickly in the sky.");
    }

    @Override
    public void hunt() {
        System.out.println("A lot of birds hunt the other animals.");
    }

    public FlyingBird(String name, int age, String livingEnvironment, String typeOfMoving) {
        super(name, age, livingEnvironment);
        this.typeOfMoving = typeOfMoving!=null||!typeOfMoving.isEmpty()||!typeOfMoving.isBlank()?typeOfMoving:"Fly";
    }

    public void fly(){
        System.out.println("The flying birds is gaining high speed.");
    }

    @Override
    public String toString(){
        return "Class flying bird: " + printAnimals() + printBird() +", type of moving " + typeOfMoving;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlyingBird that = (FlyingBird) o;
        return Objects.equals(typeOfMoving, that.typeOfMoving);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfMoving);
    }
}
