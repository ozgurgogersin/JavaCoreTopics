package StringMethods.Tasks;

/*
TODO Find the maximum and minimum element of the array
       2.way --> By using for loop and if condition
 */
public class _6_MaxMinV2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 65, 4, 76, 12};

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min Element of Array : " + min + "\nMax Element of Array :" + max);
    }
}
