package StringMethods.Tasks;
//TODO Find the count of given character in the string
// -->  String str = "helloxxhello";
// ch = 'x' ---> count = 2  ---
// then verify it is unique in the string or not?
public class _26_UniqueInSentence {
    public static void main(String[] args) {

        String str = "helloxhello";  // Positive Scenarios + Negative Scenarios

        char ch = 'x';  // I will find the count of x in this string

        int countOfch = 0;   // This is temporary value

        for (int i = 0; i < str.length(); i++) {
        // WHat is the difference between one equal and double equal  in java?
        // One equal is for assignment and double equal is for comparison

            if (str.charAt(i) == ch) {
                countOfch++;
            }

        }

        //TODO 2 --- count of x

        if (countOfch == 1) {
            System.out.println(ch + " is unique in the sentence");
        } else if (countOfch == 0) {
            System.out.println(ch + " is not available in the sentence");
        } else {
            System.out.println(ch + " is not unique");

        }
    }
}
