package StringMethods.Tasks;
/*
//TODO Print the first letter of a given string as
     Upper Case Given "applehouse" Outuput: "A".
*/
public class _18_UpperCaseOfFirstLetter {
    public static void main(String[] args) {
        String str = "applehouse";
        String firstChar=str.charAt(0)+"";
        System.out.println(firstChar.toUpperCase());
    }

}
