package StringMethods.Tasks;
//TODO Write a Java Program to Check Palindrome String
// A palindrome is a word, sentence, verse, or even number
// that reads the same backward or forward.
// Examples noon, civic, racecar, level,kazak and mom.
public class _9_PalindromeV2 {
    public static void main(String[] args) {
        String text="civxvic";
        String reverseText="";

        for (int i = 0; i < text.length(); i++) {
            reverseText+=text.charAt(text.length()-1-i);

        }
        if(reverseText.equals(text)){
            System.out.println(text+" is Palindrome Word.");

        }else {
            System.out.println(text+" is not Palindrome Word.");
        }
    }
}
