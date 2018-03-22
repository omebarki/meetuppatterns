package omar.mebarki.meetuppatterns.visitor3.model;

import omar.mebarki.meetuppatterns.visitor3.logic.Printer;

public class File {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(FileSystemVisitor visitor){
        visitor.visit(this);
    }
}
