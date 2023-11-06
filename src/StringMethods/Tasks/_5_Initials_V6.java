package StringMethods.Tasks;

public class _5_Initials_V6 {
    public static void main(String[] args) {
        String str = "Jean Jacques Rousseau The Writer and Philosopher";
        str = " " + str;


        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== ' ') {
                System.out.print(str.charAt(i+1) + ".");
            }
        }
    }
}

