package StringMethods.Tasks;
//TODO --------------------- PEAK NUMBER----------------------------------------------------
//  Peak number is not max number --> It means:  number is greater than neighbouring numbers
//  1, 2, 4, 0, 6, 7, 8   peak number here --> 4
public class _27_PeakNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 0, 6, 7, 8};
        //TODO Focus:
        //   1) The first element can not be peak so I am not beginning with arr[i]
        //   2) Assume that your peak number is arr[i+1] we will check whether It is peak or not

        for (int i = 0; i < arr.length - 2; i++) {
        //TODO arrr[i+1] (peak number) has to be bigger than left side and right side element.
            if (arr[i + 1] > arr[i] && arr[i + 1] > arr[i + 2]) {
                System.out.println(arr[i + 1] + " is peak element");
            }
        }
    }
}
