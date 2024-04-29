package design_pattern.abstract_factory;

public class Client {
    Factory factory;

    public Client(Factory factory) {
        this.factory = factory;
    }

    public TV getTV() {
        return factory.createTV();
    }

    public Freezer getFreezer() {
        return factory.createFreezer();
    }
}
