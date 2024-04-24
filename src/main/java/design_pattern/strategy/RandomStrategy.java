package design_pattern.strategy;

import java.util.Random;

public class RandomStrategy implements Strategy{


    private static final int RSN = 2;
    private Random random;

    public RandomStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {

    }

    @Override
    public boolean support(int strategyNumber) {
        return RandomStrategy.RSN == strategyNumber;
    }
}
