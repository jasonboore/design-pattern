package design_pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private int handValue;
    private String name;

    private static List<Hand> handList = new ArrayList<Hand>() {{
        add(new Hand(0));
        add(new Hand(1));
        add(new Hand(2));
    }};;
    private Hand(int handVal) {
        this.handValue = handVal;
    }

    public static Hand getHand(int handVal) {
        return handList.get(handVal);
    }

    public boolean isStrongerThan(Hand hand2) {
        return fight(hand2) == 1;
    }

    public boolean isWeakerThan(Hand hand2) {
        return fight(hand2) == -1;
    }

    private int fight(Hand hand) {
        if (this.handValue == hand.handValue) {
            return 0;
        }
        if (((this.handValue + 1) % 3) == hand.handValue) {
            return 1;
        }
        return -1;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
