package StringMethods.Tasks;

import java.util.Scanner;

//Todo take a full name from the user and print just the initials
// example
// Full name = Ozgur Gogersin
// Out-put = O.G.
public class _5_Initials_V4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your Full name: ");
        String fullName=in.nextLine();

        char firstLetterOfName=fullName.charAt(0);
        char firstLetterOfSurname=fullName.charAt(fullName.indexOf(" ")+1);

        System.out.println(firstLetterOfName+"."+firstLetterOfSurname+".");

    }

}
