package design_pattern.factorymethod.idcard;

import design_pattern.factorymethod.framework.Factory;
import design_pattern.factorymethod.framework.Product;
import design_pattern.singleton.TicketMaker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelevisionFactory extends Factory {
    Map<String, String> owners = new HashMap<>();
    TicketMaker ticketMaker = TicketMaker.getInstance();
    @Override
    public Product createProduct(String brand) {
        return new Television(ticketMaker.getNextTicketNumber() + "", brand);
    }

    @Override
    public void registerProduct(Product product) {
        owners.put(product.getId(), ((Television)product).getBrand());
    }

}
