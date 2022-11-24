package animals;

public class Bird extends Animals {
    private String livingEnvironment;


    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment!=null || !livingEnvironment.isEmpty() || !livingEnvironment.isBlank()?livingEnvironment:"Everywhere";
    }

    public Bird(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }
    @Override
    public void eat() {
        System.out.println("The birds are eating everything it will depend on type of bird.");
    }

    @Override
    public void move() {
        System.out.println("Most of birds are flying.");
    }

    public void hunt() {
        System.out.println("Birds of prey as well as animals hunt other animals.");
    }

    public String printBird() {
        return printAnimals() + ", living environment" + livingEnvironment;
    }
}