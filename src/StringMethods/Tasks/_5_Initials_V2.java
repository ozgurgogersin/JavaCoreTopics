package StringMethods.Tasks;

public class _5_Initials_V2 {

    public static void main(String[] args) {
        String sentence = "Whisper Better Flavor Slumber Cool Swim Pool Arc Flute Adventure.";
// TODO Output : HelloWorld
        String[] strArray = sentence.split(" ");
        char[][] charArray = new char[strArray.length][];


        for (int i = 0; i < strArray.length; i++) {
            charArray[i] = strArray[i].toCharArray();
            System.out.print(charArray[i][1] + " ");

        }
    }
}