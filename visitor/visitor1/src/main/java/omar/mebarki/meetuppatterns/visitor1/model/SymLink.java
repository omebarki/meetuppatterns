package omar.mebarki.meetuppatterns.visitor1.model;

import omar.mebarki.meetuppatterns.visitor1.model.File;

public class SymLink extends File {
    private String path;

    public SymLink(String name, String path) {
        super(name);
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
