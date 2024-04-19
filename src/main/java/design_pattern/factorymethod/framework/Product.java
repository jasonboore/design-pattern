package design_pattern.factorymethod.framework;

public abstract class Product {
    private String id;
    protected Product(String id) {
        this.id = id;
    }
    public abstract void use();

    public String getId() {
        return this.id;
    }
}
