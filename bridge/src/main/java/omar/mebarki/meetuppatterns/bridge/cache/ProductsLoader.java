package omar.mebarki.meetuppatterns.bridge.cache;

import omar.mebarki.meetuppatterns.bridge.model.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductsLoader implements EntityLoader<Long,Product> {

    public Map<Long, Product> loadAll() {
        System.out.println("Prodcuts loading");
        return new HashMap<Long, Product>();
    }
}
