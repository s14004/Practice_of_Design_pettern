package jp.ac.it_college.std.s14004.pdp.prototype.framework;

/**
 * Created by s14004 on 15/06/04.
 */
public interface Product extends Cloneable {
    void use(String s);
    Product createClone();
}
