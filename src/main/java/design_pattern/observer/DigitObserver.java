package design_pattern.observer;

public class DigitObserver implements Observer{
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.println("DigitObserver:" + numberGenerator.getNumber());
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
