package jp.ac.it_college.std.s14004.pdp.responsibility;

/**
 * Created by s14004 on 15/06/16.
 */
public class SpecialSupport extends Support {
    private int number;
    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            return true;
        } else {
            return false;
        }
    }
}