package omar.mebarki.meetuppatterns.visitor2.model;

import omar.mebarki.meetuppatterns.visitor2.Printer;

public class File {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print(Printer printer){
        printer.print(this);
    }
}
