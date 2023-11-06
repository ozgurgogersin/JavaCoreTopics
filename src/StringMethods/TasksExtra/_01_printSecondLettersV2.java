package StringMethods.TasksExtra;

public class _01_printSecondLettersV2 {
    public static void main(String[] args) {
        String sentence="The ten flies, all born!";

        String []strArray=sentence.split(" ");
        char [][]charArray=new char[strArray.length][];

        for (int i = 0; i < strArray.length; i++) {
            charArray[i]=strArray[i].toCharArray();

        }

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {

            }System.out.print(charArray[i][1]+" ");
        }
    }
}
