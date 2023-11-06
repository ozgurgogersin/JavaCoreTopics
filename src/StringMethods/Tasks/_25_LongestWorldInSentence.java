package StringMethods.Tasks;
// TODO STRING METHODS WITH ARRAYS
//     Find the longest word in the sentence:
//      String sentence = "Today is a great day to learn java programming language";
//      output = programming
public class _25_LongestWorldInSentence {
    public static void main(String[] args) {

        //TODO LONGEST WORD
        String sentence = "Today is a great day to learn java programming language";  // programming
        int lengthOfMaxWord = 0;  // this is temporary value for length of maxword
        String longestWord = "";   // this is temporary value for longest word

        //TODO 1.Step:  I will convert this string to array  { "Today", "is", ... ]
        String [] arr = sentence.split(" ");


        //TODO 2.Step:  I will compare the lengths of each word (element)

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()>lengthOfMaxWord) {
                lengthOfMaxWord = arr[i].length();
                longestWord = arr[i];
            }
        }

        System.out.println("lengthOfMaxWord = " + lengthOfMaxWord);  // 11
        System.out.println("longestWord = " + longestWord);  // programming
    }
}
