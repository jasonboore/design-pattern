package design_pattern.factorymethod.idcard;

import design_pattern.factorymethod.framework.Product;

public class IDCard extends Product {
    private String name;

    public IDCard(String id, String name) {
        super(id);
        this.name = name;
        System.out.println("制作" + this.name + "的ID卡," + "id为：" + getId());
    }
    @Override
    public void use() {
        System.out.println("使用" + this.name + "的ID卡,"+ "id为：" + getId());
    }

    public String getName() {
        return this.name;
    }

}
