package omar.mebarki.meetuppatterns.visitor1.model;

public class HardLink extends File {
    private String path;
    private int refCounter;

    public HardLink(String name, String path, int refCounter) {
        super(name);
        this.path = path;
        this.refCounter = refCounter;
    }

    public String getPath() {
        return path;
    }

    public int getRefCounter() {
        return refCounter;
    }
}
