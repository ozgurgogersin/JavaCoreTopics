package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
    public static void main(String[] args) {   // Collections Methods
        // Collections.frequency Method

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }


        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        // I want to find the count of 1 in my array list with an easy way?


        int countOf1 = java.util.Collections.frequency(list, 2);   // It will find the count of 1 in the list
        System.out.println("countOf1 = " + countOf1); // 5


        // Collections.sort   1) List 2) Set 3) Queue

        // Can your sort array list?                   Can you sort arrays? Arrays.sort


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(1);
        list2.add(34);
        list2.add(10);
        list2.add(230);
        list2.add(1);


        java.util.Collections.sort(list2);
        System.out.println(list2);


        // 3.method Collections.Reverse
        java.util.Collections.reverse(list2);
        System.out.println(list2);
    }

}