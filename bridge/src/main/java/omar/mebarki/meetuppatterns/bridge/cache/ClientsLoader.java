package omar.mebarki.meetuppatterns.bridge.cache;

import omar.mebarki.meetuppatterns.bridge.model.Client;

import java.util.HashMap;
import java.util.Map;

public class ClientsLoader implements EntityLoader<Long, Client> {

    public Map<Long, Client> loadAll() {
        System.out.println("Clients loading");
        return new HashMap<Long, Client>();
    }
}
