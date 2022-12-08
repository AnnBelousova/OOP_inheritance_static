package market;

public class TestMarket {
    public static void main(String[] args) {

        MarketCash marketCash = new MarketCash("");
        marketCash.getCash2().offer("Anna");
        marketCash.getCash1().offer("Luba");
        marketCash.getCash1().offer("Arina");
        marketCash.getCash1().offer("Polina");
        marketCash.getCash2().offer("Sergio");
        marketCash.getCash2().offer("Stasy");
        marketCash.getCash1().offer("Albe");
        marketCash.addToQueue("Fedor");
        marketCash.addToQueue("Marina");
        marketCash.addToQueue("Peter");
        marketCash.addToQueue("Alex");
        marketCash.addToQueue("Mike");
        marketCash.addToQueue("Liza");
        marketCash.addToQueue("Artem");
        marketCash.addToQueue("Zina");
        marketCash.addToQueue("Roma");

        System.out.println(marketCash.getCash1());
        System.out.println(marketCash.getCash2());
        System.out.println(marketCash.getCash3());

        marketCash.removeCustomer();
        marketCash.removeCustomer();
    }
}
