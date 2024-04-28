package design_pattern.observer;

public class Main {
    public static void main(String[] args) {
//        NumberGenerator numberGenerator = new RandomNumberGenerator();
//        Observer digitObserver = new DigitObserver();
//        Observer graphObserver = new GraphObserver();
//        numberGenerator.addObserver(digitObserver).addObserver(graphObserver);
//        numberGenerator.execute();
        NumberGenerator numberGenerator = new IncrementalNumberGenerator(10, 50, 5);
        Observer digitObserver = new DigitObserver();
        Observer graphObserver = new GraphObserver();
        numberGenerator.addObserver(digitObserver).addObserver(graphObserver).addObserver(new OptionObserver());
        numberGenerator.execute();
    }
}
