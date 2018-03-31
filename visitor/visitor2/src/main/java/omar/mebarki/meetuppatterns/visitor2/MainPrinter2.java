package omar.mebarki.meetuppatterns.visitor2;

import omar.mebarki.meetuppatterns.visitor2.model.File;
import omar.mebarki.meetuppatterns.visitor2.model.HardLink;
import omar.mebarki.meetuppatterns.visitor2.model.SymLink;

public class MainPrinter2 {
    public static void main(String[] args) {
        Printer printer = new Printer();

        File file = new File("F1");
        File symLink = new SymLink("S1", "/home/F1");
        File hardLink = new HardLink("H1", "/home/S1", 1);


       file.print(printer);
       symLink.print(printer);
       hardLink.print(printer);
    }
}
