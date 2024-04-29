package design_pattern.abstract_factory;

public class HisenseFactory implements Factory{
    @Override
    public TV createTV() {
        return new HisenseTV();
    }

    @Override
    public Freezer createFreezer() {
        return new HisenseFreezer();
    }
}
