package fapai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Cards {
    public static void main(String[] args) {
        Collection<String> card = new ArrayList<>();
        String[] colors = {"♠","♦","♣","♥"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        for (String col:colors) {
            for (String num:numbers) {
                card.add(col+num);
            }
        }
        card.add("jocker");
        card.add("JOCKER");
        ArrayList<String> pocker = (ArrayList<String>)card;
        Collections.shuffle(pocker);
//        System.out.println(pocker);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < 54; i++){
            if (i >= 51){
                dipai.add(pocker.get(i));
            } else if (i % 3 == 0){
                player1.add(pocker.get(i));
            }else if (i % 3 == 1){
                player2.add(pocker.get(i));
            }else{
                player3.add(pocker.get(i));
            }
        }

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);
    }
}
