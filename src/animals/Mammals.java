package animals;

public class Mammals extends Animals{

    private String livingEnvironment;
    private int movingSpeed;

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment!=null || !livingEnvironment.isEmpty() || !livingEnvironment.isBlank()?livingEnvironment:"Everywhere";
    }

    public int getMovingSpeed() {
        return movingSpeed;
    }

    public void setMovingSpeed(int movingSpeed) {
        this.movingSpeed = movingSpeed!=0?movingSpeed:35;
    }

    public Mammals(String name, int age, String livingEnvironment, int movingSpeed) {
        super(name, age);
        setMovingSpeed(movingSpeed);
        setLivingEnvironment(livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("Mammals are eating different food.");
    }

    @Override
    public void move() {
        System.out.println("Mammals move under water, on the ground and can fly.");
    }
    public void walk(){
        System.out.println("Mammals love walk with their children.");
    }

    public String printMammals() {
        return ", livingEnvironment is " + livingEnvironment +  ", movingSpeed is " + movingSpeed;
    }
}
