package StringMethods.Tasks;

import java.util.Arrays;

//TODO    What are we using to sort arrays?  --> Arrays.sort
//        What are we using to compare arrays? --> Arrays.equals
public class _3_sortingArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {4,2,3};
        int [] arr3 = {1,2,3};

        boolean sortedEqualArr= Arrays.equals(arr1,arr2);
        System.out.println("sortedEqualArr = " + sortedEqualArr);
        boolean sortedEqualArr2= Arrays.equals(arr1,arr3);
        System.out.println("sortedEqualArr 2 = " + sortedEqualArr2);
    }

}
