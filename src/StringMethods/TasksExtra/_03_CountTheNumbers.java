package StringMethods.TasksExtra;
//TODO Count the number of letters in a string
// and return true if it is even or if it is odd.
public class _03_CountTheNumbers {
    public static void main(String[] args) {
        String text = "lksl+4klmi %ls* 5tlK";

        text = text.replaceAll("[^a-zA-Z]", "");
        //TODO This is a regex code.
        // It deletes all the special characters,
        // spaces and numbers and only leave letters.
        // I strongly recommend you to do
        // your own research about regex in Java
        // ^[a-zA-Z] means any a-z or A-Z at the start of a line
        // [^a-zA-Z] means any character that IS NOT a-z OR A-Z
        System.out.println("--------------------------------");
        //TODO 1

        if (text.length() % 2 == 0)
            System.out.println(true);
        else System.out.println(false);
        System.out.println("--------------------------------");
        //TODO 2

        String text2 = "A159812097502957102512Z";

        text2 = text2.replaceAll("^[a-zA-Z]", "");
        if (text2.length() % 2 == 0)
            System.out.println(true);
        else System.out.println(false);

        System.out.println("--------------------------------");
        //TODO 3


            System.out.print("Text Lenght : " + text.length());
            if (text.length() % 2 == 0) {
                System.out.print(" --> Even");
            } else {
                System.out.print(" --> Odd");
            }
            //TODO 4
        System.out.println();
        System.out.print("--------------------------------");
        System.out.println();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)){
                count++;
            }
        }
        if (count%2==0){
            System.out.println(count+" is Even");
        }else
            System.out.println(count+" is Odd");
        }
}

