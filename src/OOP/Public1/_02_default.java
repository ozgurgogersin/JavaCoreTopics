package OOP.Public1;

public class _02_default {
    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();
        AccessModifiers.defaultName = "ozgur";
        AccessModifiers.protectedName = "ozgur";
        accessModifiers.publicName = "ozgur";
        AccessModifiers.getPrivateName();
    }
}
