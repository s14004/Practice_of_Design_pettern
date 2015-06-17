package jp.ac.it_college.std.s14004.pdp.state;

/**
 * Created by s14004 on 15/06/17.
 */
public interface State {
    void doClock(Context context, int hour);
    void doUse(Context context);
    void doAlarm(Context context);
    void doPhone(Context context);
}
