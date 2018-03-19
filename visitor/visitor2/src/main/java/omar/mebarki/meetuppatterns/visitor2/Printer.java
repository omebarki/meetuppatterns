package omar.mebarki.meetuppatterns.visitor2;

import omar.mebarki.meetuppatterns.visitor2.model.File;
import omar.mebarki.meetuppatterns.visitor2.model.HardLink;
import omar.mebarki.meetuppatterns.visitor2.model.SymLink;

public class Printer {
    public void print(File file) {
        System.out.printf("File: %S\n", file.getName());
    }

    public void print(SymLink symLink) {
        System.out.printf("SymLink: %S --> %s\n", symLink.getName(), symLink.getPath());
    }

    public void print(HardLink hardLink) {
        System.out.printf("HardLink: %S --> %s (%d)\n", hardLink.getName(), hardLink.getPath(), hardLink.getRefCounter());
    }
}
