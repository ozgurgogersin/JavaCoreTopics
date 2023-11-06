package StringMethods.Tasks;

//TODO Store the alphabet in a char array, and print it.

import java.util.Arrays;

public class _4_AlphabetInCharArray {
    public static void main(String[] args) {

        char []arr=new char[26];

        int a=0; // I am gonna use this value as index

        for (char i = 'a'; i <='z'; i++) {
            arr[a++]=i;

        }
        System.out.println("Alphabet :"+ Arrays.toString(arr));
    }
}
