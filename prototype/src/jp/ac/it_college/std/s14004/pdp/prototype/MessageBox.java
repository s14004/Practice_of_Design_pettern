package jp.ac.it_college.std.s14004.pdp.prototype;

import jp.ac.it_college.std.s14004.pdp.prototype.framework.Product;

/**
 * Created by s14004 on 15/06/04.
 */
public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.println(decochar);
        }
        System.out.println(" ");
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.println(decochar);
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
