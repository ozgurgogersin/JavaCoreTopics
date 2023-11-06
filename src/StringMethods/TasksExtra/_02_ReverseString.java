package StringMethods.TasksExtra;

//TODO Reverse a string by using for loop
// Input: “Hello World!”
// Output: “!dlroW olleH”
public class _02_ReverseString {
    public static void main(String[] args) {
        String text = "Hello World!";

        System.out.println(reverseString1("ozgur"));
        System.out.println("-------------------------------");
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(text.length() - 1 - i));
        }
        System.out.println();

        System.out.println("-------------------------------");
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
        String r = "";

        System.out.println("-------------------------------");
        for (int i = text.length() - 1; i >= 0; i--) {
            r += text.charAt(i);
        }
        System.out.println(r);
    }

    public static String reverseString1(String string) {
        String rev = "";
        for (int i = 0; i < string.length(); i++) {
            rev = string.charAt(i) + rev;
        }
        return rev;
    }
}
