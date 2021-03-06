package jp.ac.it_college.std.s14004.pdp.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by s14004 on 15/06/11.
 */
public class Directory extends Entry {
    private String name;
    private ArrayList dir = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator it = dir.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);

    }
}
