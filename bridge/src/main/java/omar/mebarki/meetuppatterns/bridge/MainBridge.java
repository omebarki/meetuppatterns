package omar.mebarki.meetuppatterns.bridge;

import omar.mebarki.meetuppatterns.bridge.cache.Cache;
import omar.mebarki.meetuppatterns.bridge.cache.Cache;
import omar.mebarki.meetuppatterns.bridge.cache.ClientsLoader;
import omar.mebarki.meetuppatterns.bridge.cache.ProductsLoader;
import omar.mebarki.meetuppatterns.bridge.model.Client;
import omar.mebarki.meetuppatterns.bridge.model.Product;

public class MainBridge {
    public static void main(String[] args) {
        Cache<Long, Product> productCache = new Cache<Long, Product>(new ProductsLoader());
        Cache<Long, Client> clientCache = new Cache<Long, Client>(new ClientsLoader());

        clientCache.loadAll();
        productCache.loadAll();
    }
}
