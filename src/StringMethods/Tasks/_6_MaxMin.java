package StringMethods.Tasks;
/*
TODO // Find the maximum and minimum element of the array
         1.way --> By using Array.sort Method
 */
import java.util.Arrays;

public class _6_MaxMin {
    public static void main(String[] args) {
        int [] arr = {1,5, 65,4,76,12};

        Arrays.sort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        System.out.println("Min Element of Array :"+arr[0]+"\nMax Element of Array :"+arr[arr.length-1]);
    }
}
