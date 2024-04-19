package design_pattern.factorymethod;

import design_pattern.factorymethod.framework.Factory;
import design_pattern.factorymethod.framework.Product;
import design_pattern.factorymethod.idcard.IDCardFactory;
import design_pattern.factorymethod.idcard.TelevisionFactory;

public class Main {
    public static void main(String[] args) {
        Factory idCardFactory = new IDCardFactory();
        Product p1 = idCardFactory.create("小红");
        Product p2 = idCardFactory.create("小绿");
        Product p3 = idCardFactory.create("小蓝");
        p1.use();
        p2.use();
        p3.use();

        Factory televisionFactory = new TelevisionFactory();
        Product t1 = televisionFactory.create("联想");
        Product t2 = televisionFactory.create("乐视");
        Product t3 = televisionFactory.create("华为");
        t1.use();
        t2.use();
        t3.use();
    }
}
