package MyLinkedList;

import java.util.Iterator;

public class MyMain {
    public static void main(String[] args) {
        MyLinkedList<String> stringLinked = new MyLinkedList<String>();
        stringLinked.addLast("abc");            // index 1
        stringLinked.addLast("def");            // index 2
        stringLinked.addLast("ghi");            // index 3
        stringLinked.addLast("jkl");            // index 4
        stringLinked.addFirst("zyx");           // index 0

        System.out.println("1. =================================================");
        System.out.println(stringLinked.size());
        System.out.println(stringLinked.getElementByIndex(3));

        System.out.println("2. =================================================");

        for (String str: stringLinked) {
            System.out.println(str);
        }

        System.out.println("3. =================================================");

        Iterator iterator = stringLinked.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
