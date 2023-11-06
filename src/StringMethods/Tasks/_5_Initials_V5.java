package StringMethods.Tasks;

import java.util.Scanner;

public class _5_Initials_V5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter fullname(consisting 3 words) : ");
        String text=sc.nextLine();
        char firstLetter=text.toUpperCase().charAt(0);
        int firstSpace=text.indexOf(" ");
        char secondLetter=text.toUpperCase().charAt(firstSpace+1);
        int lastSpace=text.lastIndexOf(" ");
        char lastLetter=text.toUpperCase().charAt(lastSpace+1);
        System.out.println("Fullname short format : "+firstLetter+"."+secondLetter+"."+lastLetter+".");
    }
}
