package StringMethods.Tasks;
//TODO Convert the string "techno study" into "Tehcno study"
// by using replaceFirst method..
public class _15_ReplaceFirst {
    public static void main(String[] args) {

        String text="techno study";
        text=text.replaceFirst("t","T");
        System.out.println(text);

    }
}
