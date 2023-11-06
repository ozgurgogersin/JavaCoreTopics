package StringMethods.Tasks;
//TODO Convert the name of domain as "gmail" --> "JohnSmith@yahoo.com";.
public class _14_ReplaceExample3 {
    public static void main(String[] args) {
        String email="JohnSmith@yahoo.com";
        email=email.replace("yahoo","gmail");
        System.out.println(email);

    }
}
