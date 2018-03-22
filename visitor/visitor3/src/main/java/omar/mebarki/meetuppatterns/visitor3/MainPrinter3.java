package omar.mebarki.meetuppatterns.visitor3;

import omar.mebarki.meetuppatterns.visitor3.logic.Printer;
import omar.mebarki.meetuppatterns.visitor3.model.File;
import omar.mebarki.meetuppatterns.visitor3.model.FileSystemVisitor;
import omar.mebarki.meetuppatterns.visitor3.model.HardLink;
import omar.mebarki.meetuppatterns.visitor3.model.SymLink;

public class MainPrinter3 {
    public static void main(String[] args) {
        FileSystemVisitor printerVisitor = new Printer();

        File file = new File("F1");
        File symLink = new SymLink("S1", "/home/F1");
        File hardLink = new HardLink("H1", "/home/S1", 1);


       file.accept(printerVisitor);
       symLink.accept(printerVisitor);
       hardLink.accept(printerVisitor);
    }
}
