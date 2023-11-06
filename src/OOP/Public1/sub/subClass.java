package OOP.Public1.sub;

import OOP.Public1.AccessModifiers;

public class subClass extends AccessModifiers {
    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();
        accessModifiers.publicName = "ozgur";
        AccessModifiers.protectedName = "name";
        AccessModifiers.getPrivateName();
    }

}
