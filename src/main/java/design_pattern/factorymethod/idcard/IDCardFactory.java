package design_pattern.factorymethod.idcard;

import design_pattern.factorymethod.framework.Factory;
import design_pattern.factorymethod.framework.Product;
import design_pattern.singleton.TicketMaker;

import java.util.*;

public class IDCardFactory extends Factory {
    Map<String, String> idMap = new HashMap<>();
    TicketMaker ticketMaker = TicketMaker.getInstance();
    @Override
    public Product createProduct(String name) {
        return new IDCard(ticketMaker.getNextTicketNumber() + "",name);
    }

    @Override
    public void registerProduct(Product product) {
        idMap.put(product.getId(), ((IDCard)product).getName());
    }

    public Map<String, String> getIdMap() {
        return this.idMap;
    }
}
