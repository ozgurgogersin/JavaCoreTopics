package StringMethods.Tasks;
/*
 //TODO Print the 1.st letter of names in the array
    String  [] names = {"Elminur", "Ali", "Hulya", "Simen", "Begench", "Ruveyda",
                "Jonathan", "Alshaun", "Manas", "Gulsen"};
        Ex: E
            A
            H
            S
            B
            ..
 */
public class _5_Initials {
    public static void main(String[] args) {
        String  [] names = {"Elminur", "Ali", "Hulya", "Simen", "Begench", "Ruveyda",
                "Jonathan", "Alshaun", "Manas", "Gulsen"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Initial 1st Letters : "+ names[i].charAt(0));
        }
    }
}
