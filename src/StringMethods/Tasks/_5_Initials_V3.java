package StringMethods.Tasks;

public class _5_Initials_V3 {
    public static void main(String[] args) {
// TODO Output : HelloWorld
        String sentence = "Whisper Better Flavor Slumber Cool Swim Pool Arc Flute Adventure.";

        String[] strArray = sentence.split(" ");

        for (int i = 0; i < strArray.length; i++) {
            System.out.println("Initial 2nd Letters : "+ strArray[i].charAt(1));
        }

        }
    }


