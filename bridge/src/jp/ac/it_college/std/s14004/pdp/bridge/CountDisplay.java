package jp.ac.it_college.std.s14004.pdp.bridge;

/**
 * Created by s14004 on 15/06/10.
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
