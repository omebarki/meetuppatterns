package omar.mebarki.meetuppatterns.visitor3.model;

import omar.mebarki.meetuppatterns.visitor3.logic.Printer;

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
    public void accept(FileSystemVisitor visitor){
        visitor.visit(this);
    }
}
