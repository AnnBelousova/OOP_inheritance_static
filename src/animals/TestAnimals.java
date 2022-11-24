package animals;

public class TestAnimals {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Gazelle",15,"low rocky hills and plateaus", 97, "herbs and other plants");
        Herbivores giraffe = new Herbivores("Giraffe",25,"the savannahs of Africa", 60, "herbs");
        Herbivores horse = new Herbivores("Horse",5,"steppes, semi-deserts, forest-steppes", 88, "grass, oats, hay");

        Predator hyena = new Predator("Hyena", 12, "in savannas, shrubby thickets and semi-deserts",64, "meat");
        Predator tiger = new Predator("Tiger", 10, "ain forests, grasslands, savannas and even mangrove swamps",60, "meat");
        Predator bear = new Predator("Bear", 2, "forests, mountains, tundra, deserts and grassy areas",50, "honey");

        Amphibian frog = new Amphibian("Frog", 1, "swamp");
        Amphibian grassSnake = new Amphibian("Grass Snake freshwater", 3, "swamp");

        FlightlessBird peacock = new FlightlessBird("Peacock", 5, "open lowland forests, as well as farms and agricultural fields", "steps");
        FlightlessBird penguin = new FlightlessBird("Penguin", 4, "water", "swim");
        FlightlessBird dodo = new FlightlessBird("Dodo", 7, " inhabited the island of Mauritius", "steps");

        FlyingBird seagull = new FlyingBird("Seagull", 6, "coast", "fly");
        FlyingBird albatross = new FlyingBird("Albatross", 1, " all of the world's oceans except the Arctic", "fly");
        FlyingBird falcon = new FlyingBird("Falcon", 7, "grasslands, deserts, arctic tundras, and different types of forests", "fly");
        FlyingBird falcon2 = new FlyingBird("Falcon", 7, "grasslands, deserts, arctic tundras, and different types of forests", "fly");

        if(falcon.equals(falcon2)){
            System.out.println(falcon.equals(falcon2));
            System.out.println("Objects is equals.");
        }else {
            System.out.println("Objects is not equals.");
        }


        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);

        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);

        System.out.println(frog);
        System.out.println(grassSnake);

        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);

        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);


    }
}
