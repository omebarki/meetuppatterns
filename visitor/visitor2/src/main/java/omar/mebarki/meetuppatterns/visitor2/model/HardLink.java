package omar.mebarki.meetuppatterns.visitor2.model;

import omar.mebarki.meetuppatterns.visitor2.Printer;

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

    @Override
    public void print(Printer printer) {
        printer.print(this);
    }
}
