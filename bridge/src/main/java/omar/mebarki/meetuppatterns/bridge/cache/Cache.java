package omar.mebarki.meetuppatterns.bridge.cache;

import java.util.Map;

public class Cache<I, T> {
    private Map<I, T> cache;
    private EntityLoader<I, T> entityLoader;

    public Cache(EntityLoader<I, T> entityLoader) {
        this.entityLoader = entityLoader;
    }
    public void loadAll() {
        this.cache = entityLoader.loadAll();
    }
    public T get(I id) {
        return cache.get(id);
    }
}
