package design_pattern.strategy;

import java.util.Random;

public class ProbStrategy implements Strategy{
    private static final int PSN = 1;
    private int[][] history = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
    private Hand prevHand;
    private Hand curHand;
    private Random random;

    public ProbStrategy(int seed) {
        prevHand = Hand.getHand(0);
        curHand = Hand.getHand(0);
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int curHandHandValue = this.curHand.getHandValue();
        int bet = random.nextInt(getSum(curHandHandValue));
        int handValue = 0;
        if (bet < history[curHandHandValue][0]) {
            handValue = 0;
        } else if (bet < history[curHandHandValue][1]) {
            handValue = 1;
        } else {
            handValue = 2;
        }
        Hand hand = Hand.getHand(handValue);
        prevHand = curHand;
        curHand = hand;
        return curHand;
    }

    @Override
    public void study(boolean win) {
        if (win) {
            history[prevHand.getHandValue()][curHand.getHandValue()]++;
        } else {
            history[prevHand.getHandValue()][(curHand.getHandValue() + 1) % 3]++;
            history[prevHand.getHandValue()][(curHand.getHandValue() + 2) % 3]++;
        }
    }

    public int getSum(int row) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += this.history[row][i];
        }
        return sum;
    }

    @Override
    public boolean support(int strategyNumber) {
        return strategyNumber == ProbStrategy.PSN;
    }
}
