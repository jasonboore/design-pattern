package design_pattern.abstract_factory;

public class HaierFactory implements Factory{
    @Override
    public TV createTV() {
        return new HaierTV();
    }

    @Override
    public Freezer createFreezer() {
        return new HaierFreezer();
    }
}
