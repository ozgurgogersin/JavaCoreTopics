package Interface_Set_HashSet.Tasks;

import java.util.Arrays;
import java.util.HashSet;

// TODO Generate a Set
//   Write a method with a method called AddElements that can add 1 or more than 1 number.
//   Fill the set with the AddElements method.
//   Print all elements in console
public class _03_fillSetWithAddElementsMethod {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
      add(hs,1,2,3,4,5,6,7,8,9);
        System.out.println(hs);
    }

    public static void add(HashSet<Integer>hs,Integer...numbers){
        hs.addAll(Arrays.asList(numbers));
    }
}
