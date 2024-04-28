package design_pattern.observer;

public class OptionObserver implements Observer {
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.print("OptionObserver:");
        if ((numberGenerator.getNumber() & 1) == 0) {
            System.out.println("**");
        } else {
            System.out.println("*");
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
