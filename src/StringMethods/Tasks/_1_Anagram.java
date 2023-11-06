package StringMethods.Tasks;

import java.util.Arrays;

//TODO What is Anagram ?
// 1) Same Letters "DAeR" --- "ReAd"
// 2) Order may be  different
// 3) Length is same
// Can you check whether two words (given) are anagram or not?
public class _1_Anagram {
    public static void main(String[] args) {
        String text1="DAeR";
        String text2="ReAd";
        String text3="ReDa";

        text1=text1.toLowerCase();
        text2=text2.toLowerCase();
        text3=text3.toLowerCase();

        // FIRST STEP ->We are going to convert these strings to char array.
        char[]arr1=text1.toCharArray();
        char[]arr2=text2.toCharArray();
        char[]arr3=text3.toCharArray();

        // SECOND STEP -> Sorting the Arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        if (Arrays.equals(arr1,arr3)){
            System.out.println("These words are anagram words");
        }else {
            System.out.println("NOT ANAGRAM");
        }


    }


}
