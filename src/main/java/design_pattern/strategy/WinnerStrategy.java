package design_pattern.strategy;

import java.util.Random;

public class WinnerStrategy implements Strategy{
    private Hand prevHand;
    private boolean won = false;
    private Random random;
    private static int WSN = 0;

    public WinnerStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }

    @Override
    public boolean support(int strategyNumber) {
        return strategyNumber == WinnerStrategy.WSN;
    }
}
