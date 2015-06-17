package jp.ac.it_college.std.s14004.pdp.responsibility;

/**
 * Created by s14004 on 15/06/16.
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
