package StringMethods.Tasks;

import java.util.Scanner;

/*
//TODO Receive a text from the console and convert it to all lower case.
*/
public class _16_toLowerCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text please");
        String text = input.nextLine();

        text = text.toLowerCase();
        System.out.println(text);

        // sout (text.toLowerCase());

    }
}
