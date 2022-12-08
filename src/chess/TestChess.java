package chess;

import java.util.ArrayList;
import java.util.List;

public class TestChess {
    static List<List<String>> biDemArrList = new ArrayList<>();

    public static void main(String[] args) {
//        String ourNumber = biDemArrList.get(0).get(1);
        example();
    }

    public static void example() {

        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j = j + 2) {
                    biDemArrList.get(i).add(j, "◯");
                    for (int k = j + 1; k < 7; k++) {
                        biDemArrList.get(i).add(k, "•");
                    }
                }

            } else {
                for (int j = 0; j < 8; j = j + 2) {
                    biDemArrList.get(i).add(j, "•");
                    for (int k = j + 1; k < 7; k++) {
                        biDemArrList.get(i).add(k, "◯");
                    }
                }
            }
        }
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(biDemArrList.get(i).get(j) + " ");
                }
                System.out.println();
            }
    }
}
