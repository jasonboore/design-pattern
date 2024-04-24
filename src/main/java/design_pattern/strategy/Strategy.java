package design_pattern.strategy;

public interface Strategy {
    Hand nextHand();
    void study(boolean win);
    boolean support(int strategyNumber);
}
