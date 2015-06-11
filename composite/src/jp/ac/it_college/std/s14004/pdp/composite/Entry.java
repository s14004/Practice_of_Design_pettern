package jp.ac.it_college.std.s14004.pdp.composite;

import com.sun.xml.internal.org.jvnet.fastinfoset.FastInfosetException;

/**
 * Created by s14004 on 15/06/11.
 */
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreamentException {
        throw new FileTreamentException();
    }

    public void printList() {
        printList();
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
