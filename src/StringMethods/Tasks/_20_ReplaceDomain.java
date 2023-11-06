package StringMethods.Tasks;
//TODO  Convert the name of domain as "gmail"
// --> "JohnSmith@yahoo.com";
public class _20_ReplaceDomain {
    public static void main(String[] args) {
        String text="JohnSmith@yahoo.com";
        System.out.println(text.replace("yahoo","gmail"));
    }
}