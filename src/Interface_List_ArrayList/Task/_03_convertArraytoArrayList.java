package Interface_List_ArrayList.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TODO  How can you convert an array to array list?
public class _03_convertArraytoArrayList {

    public static void main(String[] args) {

        String[] array = {"java", "pythoon", "sql", "XSS"};

        ArrayList<String> list = new ArrayList<>(List.of(array));
        System.out.println(list);
        System.out.println("-------------------------------");

        // addAll  -- the ability to add more than one element in one time
        ArrayList<Integer> newList = new ArrayList<>();
        newList.addAll(Arrays.asList(1,2,4,5,6,7,8,9,11));
        System.out.println(newList);

        //ArrayList<Integer> newList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        /*
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        */

    }
}
