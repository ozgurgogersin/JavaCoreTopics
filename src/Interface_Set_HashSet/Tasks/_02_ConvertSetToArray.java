package Interface_Set_HashSet.Tasks;

import java.util.Arrays;
import java.util.HashSet;

// TODO Create a SET and add 5 random elements
//  Convert this Set to an array in a function.
public class _02_ConvertSetToArray {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        while (hs.size() < 5) {
            hs.add((int) (Math.random() * 20));
        }

        System.out.println(hs);
        Integer[] array = convertToArray(hs);
        System.out.println(Arrays.toString(array));
    }

    public static Integer[] convertToArray(HashSet<Integer> hs) {
        Integer[] arr;
        arr = hs.toArray(hs.toArray(new Integer[hs.size()]));
        return arr;
    }
}

