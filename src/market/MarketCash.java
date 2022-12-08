package market;

import transport.Mechanic;

import java.security.SecureRandom;
import java.util.*;

public class MarketCash {
    private String customer;
    private final Queue<String> cash1 = new ArrayDeque<>(5);
    private final Queue<String> cash2 = new ArrayDeque<>(5);
    private Queue<String> cash3 = new ArrayDeque<>(5);
    //ArrayList<String> total = new ArrayList<>(cash1.size() + cash2.size() + cash3.size());

    public void addToQueue(String customer){
        if (cash1.size() <= cash2.size() && cash1.size() < 5){
            cash1.offer(customer);
        } else if (cash2.size() < cash1.size() && cash2.size() < 5) {
            cash2.offer(customer);
        } else if (cash1.size() >= 5 || cash2.size() >= 5) {
            if (cash3.size() >= 5){
                System.out.println("Please call Galya");
            }else{
                cash3.offer(customer);
            }
        }
    }
    public void removeCustomer(){
        int random = (int) (Math.random()*3);
        if(random == 1){
            cash1.poll();
        }else if (random == 2){
            cash2.poll();
        }else if (random == 3){
            cash3.poll();
        }
        System.out.println(cash1 + " " + cash2 + " " + cash3);
    }

    public String getCustomer() {
        return customer;
    }

    public Queue<String> getCash1() {
        return cash1;
    }

    public Queue<String> getCash2() {
        return cash2;
    }

    public Queue<String> getCash3() {
        return cash3;
    }

    public MarketCash(String customer) {
        this.customer = customer;
    }

}
