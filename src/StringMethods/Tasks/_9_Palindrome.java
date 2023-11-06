package StringMethods.Tasks;
//TODO Write a Java Program to Check Palindrome String
// A palindrome is a word, sentence, verse, or even number
// that reads the same backward or forward.
// Examples noon, civic, racecar, level,kazak and mom.
public class _9_Palindrome {
    public static void main(String[] args) {
        String text = "civxvic";

        char arr[]=text.toCharArray();

        boolean isTrue=true;
        for (int i = 0; i < arr.length; i++) {
            if (text.charAt(i)!=text.charAt(arr.length-1-i)){
                isTrue=false;
                break;
            }

        }System.out.println(text+" is " + isTrue+ " Palindrome Word.");
    }
}
