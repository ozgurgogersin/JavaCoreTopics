package StringMethods.Tasks;

//TODO
// String text = "2094904439rememeeejlkjew**2*2*";
// Retrive numbers, letters and special chars
// and print each group with different variables..
public class _21_RetrieveCharacters {
    public static void main(String[] args) {
        String text = "2094904439rememeeejlkjew**2*2*";
        String number = "";
        String letter = "";
        String specialChar = "";

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                number += text.charAt(i);
            } else if (Character.isLetter(text.charAt(i))) {
                letter += text.charAt(i);
            } else {
                specialChar += text.charAt(i);
            }

        }
        System.out.println("Number = " + number);
        System.out.println("Letter= " + letter);
        System.out.println("specialChar = " + specialChar);
    }
}
