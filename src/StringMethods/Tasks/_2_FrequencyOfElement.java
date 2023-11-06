package StringMethods.Tasks;
//TODO Find the count of x in
// String "helloxXhello"; Output:2
public class _2_FrequencyOfElement {
    public static void main(String[] args) {
        String text= "helloxXhello";
        text=text.toLowerCase();

        // What is output --> 2  --> integer number
        char []arr=text.toCharArray(); // converted the given string  to char array
        int countOfx=0; // temporary value as zero

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=='x'){
                countOfx++;
            }
        }
        System.out.println("countOfx = " + countOfx);
    }
    
}
