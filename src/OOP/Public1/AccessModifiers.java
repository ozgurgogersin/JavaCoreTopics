package OOP.Public1;

public class AccessModifiers {
    public static String publicName;
    static String defaultName;
    protected static String protectedName;

    private static String privateName;
    public static void main(String[] args) {
        privateName="ozgur"; // you can reach in same class even you don't need to create get set

        setPrivateName("ozgur");
        getPrivateName();
    }
    public static void setPrivateName(String privateName) {
        AccessModifiers.privateName = privateName;
    }

    public static String getPrivateName() {
        return privateName;
    }



}
