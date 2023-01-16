package L04_Ex003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        Integer t = Methods.getElementFromUCollection(data, 0);
//        Integer t = Methods.<Integer>getElementFromUCollection(data, 0); - same as above, but <Integer> is not necessary
        System.out.println(t);
//        var el = Methods.getElementFromIntegerCollection(data, 1);
//        System.out.println(el);
//        el = Methods.<Integer>getElementFromUCollection(data, 2);
//        System.out.println(el);
//        el = Methods.getElementFromUCollection(data, 3);
//        System.out.println(el);
    }
}
