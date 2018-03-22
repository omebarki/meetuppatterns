package omar.mebarki.meetuppatterns.visitor3.logic;

import omar.mebarki.meetuppatterns.visitor3.model.File;
import omar.mebarki.meetuppatterns.visitor3.model.FileSystemVisitor;
import omar.mebarki.meetuppatterns.visitor3.model.HardLink;
import omar.mebarki.meetuppatterns.visitor3.model.SymLink;

public class Printer implements FileSystemVisitor {

    @Override
    public void visit(File file) {
        System.out.printf("File: %S\n", file.getName());
    }

    @Override
    public void visit(SymLink symLink) {
        System.out.printf("SymLink: %S --> %s\n", symLink.getName(), symLink.getPath());
    }


    @Override
    public void visit(HardLink hardLink) {
        System.out.printf("HardLink: %S --> %s (%d)\n", hardLink.getName(), hardLink.getPath(), hardLink.getRefCounter());
    }

}
