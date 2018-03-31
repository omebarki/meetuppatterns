package omar.mebarki.meetuppatterns.visitor2.model;

import omar.mebarki.meetuppatterns.visitor2.Printer;

public class SymLink extends File {
    private String path;

    public SymLink(String name, String path) {
        super(name);
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    @Override
    public void print(Printer printer) {
        printer.print(this);
    }
}
