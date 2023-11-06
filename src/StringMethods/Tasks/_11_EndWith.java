package StringMethods.Tasks;

import java.util.Scanner;

/*
//TODO Have a text from scanner, if the text ends with "java" print
    "True" else "False".
*/
public class _11_EndWith {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text=in.nextLine();

        if (text.endsWith("java")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
