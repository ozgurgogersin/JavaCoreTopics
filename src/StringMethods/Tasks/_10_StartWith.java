package StringMethods.Tasks;

import java.util.Scanner;

/*
//TODO Have a text from scanner, if the text starts with "hello"
    print "True" else "False".
 */
public class _10_StartWith {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text=in.nextLine();

        if (text.startsWith("hello")){
            System.out.println("True");
        }else
            System.out.println("False");
    }
}
