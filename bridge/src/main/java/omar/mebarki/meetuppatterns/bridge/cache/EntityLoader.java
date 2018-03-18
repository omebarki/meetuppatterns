package omar.mebarki.meetuppatterns.bridge.cache;

import java.util.Map;

public interface EntityLoader<I,T> {
    Map<I,T> loadAll();
}
