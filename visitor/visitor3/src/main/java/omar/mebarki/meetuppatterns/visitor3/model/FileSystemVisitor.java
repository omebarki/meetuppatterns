package omar.mebarki.meetuppatterns.visitor3.model;

/**
 * Created by retina on 22/03/2018.
 */
public interface FileSystemVisitor {
    public void visit(File file);

    public void visit(SymLink symLink);

    public void visit(HardLink hardLink);
}
