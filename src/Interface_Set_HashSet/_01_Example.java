package Interface_Set_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class _01_Example {

    public static void main(String[] args) {


        // COLLECTIONS   : 1) List 2) Set 3) Queue
        // Maps ++ Pair of keys


        // Set: 1) HashSet   2) LinkedHashSet   3) TreeSet


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add (3);

        System.out.println(list);

        // {1,2,3 } (non-duplicated version)

        // How can you remove duplicates from this array list?

        // 1) For Loop


        // First Step : I will create a new array list for non-duplicated version

        ArrayList<Integer> nonDuplicated = new ArrayList<>();

        // Second Step:


        for (int i = 0; i < list.size() ; i++) {

            if (nonDuplicated.contains(list.get(i))) {
                continue;   // skips
            } else {
                nonDuplicated.add(list.get(i));
            }
        }

        System.out.println(nonDuplicated);


        // Second Way
        Set<Integer> set = new HashSet<>();
        set.addAll (list);  // I added an arraylist to a hash set.

        System.out.println(set);


        // Difference between set and list
        // 1) Set does not allow duplicates  2) Set does not have indexes



        // Data Structure : maps + collection + array

        String str = "aaaabbbbccccddddeeef";   // abcdef

        Set<String> set1 = new TreeSet<>();

        for (int i = 0; i < str.length(); i++) {
            set1.add(str.charAt(i) + "");

        }

        System.out.println("set1 = " + set1);



        // As a Software Tester How do you face set in your framework?

        // asksdk2344kjkladsflkjfs!!!!! ( This is an alfa numeric number)

        // Return type of tabs codes is eveytime Set

    }


}
