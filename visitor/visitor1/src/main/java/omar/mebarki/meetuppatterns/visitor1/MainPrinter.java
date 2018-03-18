package omar.mebarki.meetuppatterns.visitor1;

import omar.mebarki.meetuppatterns.visitor1.model.File;
import omar.mebarki.meetuppatterns.visitor1.model.HardLink;
import omar.mebarki.meetuppatterns.visitor1.model.SymLink;

public class MainPrinter {
    public static void main(String[] args) {
        File file = new File("F1");
        File symLink = new SymLink("S1", "/home/F1");
        File hardLink = new HardLink("H1", "/home/S1", 1);

        Printer printer = new Printer();
        printer.print(file);
        printer.print(symLink);
        printer.print(hardLink);
    }
}
