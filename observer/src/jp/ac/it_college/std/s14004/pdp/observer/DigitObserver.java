package jp.ac.it_college.std.s14004.pdp.observer;

import javax.management.IntrospectionException;

/**
 * Created by s14004 on 15/06/16.
 */
public class DigitObserver implements Observer {
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
