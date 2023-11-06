package OOP.Public2.sub;

import OOP.Public1.AccessModifiers;

public class subClass extends AccessModifiers {
    public static void main(String[] args) {
     //   protectedName="ozgur";
        AccessModifiers accessModifiers=new AccessModifiers();
        accessModifiers.publicName="name";
        AccessModifiers.protectedName="name";
        AccessModifiers.getPrivateName();


    }

    public void deneme(){
   AccessModifiers accessModifiers=new AccessModifiers();
        accessModifiers.publicName="name";
        AccessModifiers.protectedName="name";
        AccessModifiers.getPrivateName();



    }
}
