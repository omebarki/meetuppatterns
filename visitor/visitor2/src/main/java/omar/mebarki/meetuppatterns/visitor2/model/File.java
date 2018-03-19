package omar.mebarki.meetuppatterns.visitor2.model;

import omar.mebarki.meetuppatterns.visitor2.Printer;

public class File {
    protected Printer printer;

    private String name;

    public File(String name, Printer printer) {
        this.name = name;
        this.printer = printer;
    }

    public String getName() {
        return name;
    }

    public void print(){
        printer.print(this);
    }
}
