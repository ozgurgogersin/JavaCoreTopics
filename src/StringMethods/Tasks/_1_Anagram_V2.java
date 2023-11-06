package StringMethods.Tasks;

import java.util.Arrays;

public class _1_Anagram_V2 {
    public static void main(String[] args) {
        String text1 = "DAeR";
        String text2 = "ReAD";

        text1 = text1.toLowerCase().replaceAll("\\s+", "");
        text2 = text2.toLowerCase().replaceAll("\\s+", "");

        if (text1.length()!=text2.length()){
            System.out.println("Not Anagram");
            return;
        }

        char[]arr1=text1.toCharArray();
        char[]arr2=text2.toCharArray();
        System.out.println(arr1+" "+arr2);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(arr1+" "+arr2);
        if (Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }else {
            System.out.println("not anagram");
        }
    }
}