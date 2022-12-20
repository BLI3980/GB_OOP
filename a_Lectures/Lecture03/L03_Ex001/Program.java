// Lecture03 Plan:
// 01. Intro
// 02. Iterator<E>
// 03. Iterable<E>
// 04. Comparator<E>
// 05. Comparable<E>
// 06. Comparable, equals, ==
// 07. foreach for own types
// 08. Examples
// 09. Resume

package L03_Ex001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

         List<Integer> nums = new ArrayList<>();
         nums.add(1);
         nums.add(12);
         nums.add(123);
         nums.add(1234);
         nums.add(12345);

         Iterator<Integer> iter = nums.iterator();
         while (iter.hasNext()) {
             System.out.println(iter.next());
         }

//        Worker worker = new Worker(
//            "Имя", "Фамилия", 23, 4567);
//
//        Iterator<Object> components = worker.iterator();

        
    }
}
