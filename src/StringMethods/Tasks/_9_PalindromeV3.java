package StringMethods.Tasks;

//TODO Write a Java Program to Check Palindrome String
// A palindrome is a word, sentence, verse, or even number
// that reads the same backward or forward.
// Examples noon, civic, racecar, level,kazak and mom.
public class _9_PalindromeV3 {
    public static void main(String[] args) {
        String text = "civxvic";
        String reverseText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText += text.charAt(i);

        }
        if (text.equals(reverseText)) {
            System.out.println(text + " is Palindrome Word.");
        } else {
            System.out.println(text + " is not Palindrome Word.");
        }
    }
}
