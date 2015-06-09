package jp.ac.it_college.std.s14004.pdp.template;

/**
 * Created by s14004 on 15/06/04.
 */
public class CharDisplay extends AbstractDisplay {

    private char ch;
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.println("<<");
    }

    @Override
    public void print() {
        System.out.println(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
