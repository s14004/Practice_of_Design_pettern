package jp.ac.it_college.std.s14004.pdp.visitor;

/**
 * Created by s14004 on 15/06/11.
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
