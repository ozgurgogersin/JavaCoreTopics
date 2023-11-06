package StringMethods.Tasks;

import java.util.Arrays;

/*
TODO  Get the square of each element and store them in a new array.
        {1,2,3,4,5};  -->  {1,4,9,16,25}
 */
public class _7_SquareOfNumbers {
    public static void main(String[] args) {

        double arr[] = {1, 2, 3, 4, 5};// In the arrays size is fixed..
        double[] squareArr = new double[arr.length];// This is a new array, square values will be stored here

        for (int i = 0; i < arr.length; i++) {
            squareArr[i]=arr[i]*arr[i];
            
        }
        System.out.println("squareArr = " + Arrays.toString(squareArr));
    }
}
