package design_pattern.observer;

public class IncrementalNumberGenerator extends NumberGenerator{
    private int initNum;
    private int endNum;
    private int step;
    private int number;


    public IncrementalNumberGenerator(int initNum, int endNum, int step) {
        this.initNum = initNum;
        this.endNum = endNum;
        this.step = step;
    }

    @Override
    protected int getNumber() {
        return this.number;
    }

    @Override
    protected void execute() {
        for (number = initNum; number < endNum; number += step) {
            notifyObservers();
        }
    }
}
