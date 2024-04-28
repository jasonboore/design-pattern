package design_pattern.observer;

public class GraphObserver implements Observer{
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.print("GraphObserver:");
        for (int i = 0; i < numberGenerator.getNumber(); i++) {
            System.out.print("*");
        }
        System.out.println();
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
