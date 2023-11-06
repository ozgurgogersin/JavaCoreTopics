package StringMethods.Tasks;
//TODO Print only the domain name from the given string
// "johndoe@gmail.com"  --> Output : gmail
public class _23_SubString {
    public static void main(String[] args) {

        String str="johndoe@gmail.com";
        int beginningIndex=str.indexOf("@")+1;// index including.
        int endingIndex=str.indexOf(".");
        String domain=str.substring(beginningIndex,endingIndex);
        System.out.println(domain);

    }
}
