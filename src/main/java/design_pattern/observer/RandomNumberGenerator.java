package design_pattern.observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator{
    private Random random = new Random();
    private int number;
    @Override
    protected int getNumber() {
        return this.number;
    }

    @Override
    protected void execute() {
        for (int i = 0; i < 50; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
