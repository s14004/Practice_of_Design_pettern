package jp.ac.it_college.std.s14004.pdp.af.factory;

/**
 * Created by s14004 on 15/06/10.
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
