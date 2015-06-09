package jp.ac.it_college.std.s14004.pdp.prototype;

import jp.ac.it_college.std.s14004.pdp.prototype.framework.Product;

/**
 * Created by s14004 on 15/06/04.
 */
public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char ulchar) {

        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.println(" ");
        for (int i = 0; i < length; i++) {
            System.out.println(ulchar);
        }
        System.out.println(" ");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
