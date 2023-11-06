package Interface_List_ArrayList.Task;

import java.util.ArrayList;

// TODO Reversed String
//  We are gonna reverse Array List
//  create a method/function to reverse an array list
public class _04_reverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();

        // TODO I want to add elements from 1 to 10
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        //TODO This array list is to store elements in reverse order
        ArrayList<Integer>reverse=new ArrayList<>();
        for (int i = list.size()-1; i >=0 ; i--) {
            reverse.add(list.get(i));

        }
        System.out.println(reverse);
    }

}
