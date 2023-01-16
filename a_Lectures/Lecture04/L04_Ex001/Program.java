package L04_Ex001;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // # region type save
//        // List<String> list = new ArrayList<String>();
//        // List<String> list = new ArrayList<>();
//        // new ArrayList<>(); != new ArrayList();
//
//        for (int i = 1; i <= 5; i++){
//            list.add(String.format("string %d", i));
//        }
//        System.out.println(list);
//
//         // list.add(123);
//         // The method add(int, String)
//         // in the type List<String> is not applicable for arguments (.....

        // #endregion

        // #region raw type
        // ArrayList is a raw type. References to generic type ArrayList<E> .....
        // parametrized
        List list = new ArrayList();

        for (int i = 1; i <= 5; i++){
            list.add(String.format("string %d", i));
        }

        System.out.println(list);
//        System.out.println(allLength(list));

        list.add(123);
        System.out.println(list);
        // System.out.println(allLength(list));
        // ClassCastException: class java.lang.Integer cannot be cast to class ...

        // #endregion

    }




}
