package StringMethods.TasksExtra;
//TODO  Find second words in given sentence and print.
public class _01_printSecondLetters {
    public static void main(String[] args) {

        String sentence="The ten flies,all born!";

        String []strArray=sentence.split("[ \\,,]");

        char[][] charArray=new char[strArray.length][];

        for (int i = 0; i < strArray.length; i++) {
            charArray[i]=strArray[i].toCharArray();
            System.out.print(charArray[i][1]+" ");
        }
    }
}
