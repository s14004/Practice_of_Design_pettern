package jp.ac.it_college.std.s14004.pdp.state;

/**
 * Created by s14004 on 15/06/17.
 */
public interface Context {
    void setClock(int hour);
    void changeState(State state);
    void callSecurityCenter(String msg);
    void recordLog(String msg);
}
