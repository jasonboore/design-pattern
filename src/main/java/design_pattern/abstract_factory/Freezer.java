package design_pattern.abstract_factory;

public abstract class Freezer extends Product {
    public Freezer(String brand) {
        super(brand);
    }
    public String getName() {
        return getBrand() + "Freezer";
    }

}
