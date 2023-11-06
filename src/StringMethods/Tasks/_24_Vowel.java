package StringMethods.Tasks;

import java.util.Scanner;

//TODO Find and count Vowels in given text;
public class _24_Vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT A WORD: ");
        String text = in.nextLine();
        String vowel = "aeıioöuü";

        char[] textArray = text.toCharArray();
        char[] vowelArray = vowel.toCharArray();

        int count = 0;
        for (int i = 0; i < textArray.length; i++) {
            for (int j = 0; j < vowelArray.length; j++) {
                if (textArray[i] == vowelArray[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
