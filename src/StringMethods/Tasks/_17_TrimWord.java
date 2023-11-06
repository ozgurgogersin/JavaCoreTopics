package StringMethods.Tasks;

//TODO  trim method in Java.
public class _17_TrimWord {
    public static void main(String[] args) {

        String str = "          hello java       ";
        System.out.println(str + " " + str.length());

        str = str.trim();
        System.out.println(str + " " + str.length());

    }
}
