package Interface_Set_HashSet.Tasks;

import java.util.HashSet;
import java.util.Set;

public class _01_fillSetWithRandomNumbers {
    // TODO  Create a HashSet with 10 elements.
    //  fill with random numbers from 1 to 20.
    //  create a function that prints Set

    public static void main(String[] args) {
        Set<Integer>hs=new HashSet<>();
        while (hs.size()<10){
            hs.add((int) (Math.random()*100));
        }
        print(hs);
    }
    public static void print(Set<Integer>hs){
        System.out.println(hs);
    }
}
