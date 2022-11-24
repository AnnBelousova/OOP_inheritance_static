package animals;

public class Animals {
    private final String name;
    private int age;
    public void eat(){

    };
    public void sleep(){

    };
    public void move(){

    };

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animals(String name, int age) {
        this.name = name!=null || !name.isEmpty()||!name.isBlank()?name:"Animal";
        this.age = age!=0?age:10;
    }

    public String printAnimals() {
        return name  +
                ", age " + age;
    }

}
