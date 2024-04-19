package design_pattern.factorymethod.idcard;

import design_pattern.factorymethod.framework.Product;

public class Television extends Product {
    private String brand;

    public Television(String id, String brand) {
        super(id);
        this.brand = brand;
        System.out.println("制作" + this.brand + "的电视," + "id为：" + getId());
    }

    @Override
    public void use() {
        System.out.println("使用" + this.brand + "的电视," + "id为：" + getId());
    }

    public String getBrand() {
        return this.brand;
    }
}
