package design_pattern.abstract_factory;

public abstract class TV extends Product{
    public TV(String brand) {
        super(brand);
    }

    public String getName() {
        return getBrand() + "TV";
    }

}
