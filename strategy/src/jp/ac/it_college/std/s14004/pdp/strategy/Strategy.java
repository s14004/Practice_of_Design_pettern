package jp.ac.it_college.std.s14004.pdp.strategy;

import jp.ac.it_college.std.s14004.pdp.strategy.Hand;

/**
 * Created by s14004 on 15/06/10.
 */
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
