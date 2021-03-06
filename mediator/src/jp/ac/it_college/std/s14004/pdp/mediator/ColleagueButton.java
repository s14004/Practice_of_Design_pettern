package jp.ac.it_college.std.s14004.pdp.mediator;

import java.awt.*;
import java.awt.event.InputMethodEvent;

/**
 * Created by s14004 on 15/06/16.
 */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;
    public ColleagueButton(String caption) {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
