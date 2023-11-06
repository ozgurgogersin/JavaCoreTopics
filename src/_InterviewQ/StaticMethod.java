package _InterviewQ;

public class StaticMethod {

    public static void main(String[] args) {
        System.out.println("I am from the main method");

        Hello();

    }

    static {

        System.out.println("I am from the static block");
    }


    public static void Hello() {
        System.out.println("I am from the custom method");
    }
}