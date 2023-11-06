package _InterviewQ;

//TODO 1) What are the data types in java

//TODO         - Primitive
//TODO         - Non Primitive

//TODO         byte, short,int, float, double, long (primitive)
//TODO         boolean (primitive)
//TODO         String (non-primitive)


//TODO         2) What is casting in java?

//TODO         Implicit Casting:
//TODO         Smaller data types can be directly assigned to larger data types

//TODO         byte x = 14;
//TODO         int y = x;

//TODO         Explicit Casting:
//TODO         Larger data types can not be directly assingned, only explicitly assigned.

//TODO         long z = 1234;
//TODO         int a = (int) z;


//TODO         3) How can you convert string to integer?

//TODO         Integer.parseInteger (Wrapper Class in java)

//TODO         String str = "12";
//TODO         int number = Integer.parseInt(str);
//TODO         System.out.println(number + 3); // 15


//TODO         -- Reverse of it-- int to string
//TODO         int num2 = 13;
//TODO         String str2 = String.valueOf(num2);
//TODO         System.out.println(str2 + 1); // 131



//TODO         4) What is the difference between Array and Array List?

//TODO         Array (size is fixed, supports primitives & non-primitives, compononent of data structure in java)

//TODO         ArrayList (supports only non-primitives, size is dynamic, component of collection in java)


//TODO         5) What is method in java?

//TODO         Block of code, when called, performs specific actions.

//TODO         Custom Methods:
//TODO         1. void methods
//TODO         2. void methods with parameters
//TODO         3. return methods
//TODO         4. returns with parameters


//TODO         6) Create a method that reverses a string? (create any way, does not matter)



//TODO         7) Break statements can only be used in Switch blocks. T / F
//TODO         False, It can be used in Loops.



//TODO         8) What is method overloading?

//TODO         same method name, different parameters

//TODO         return type, access modifiers and specifiers can be same or can be different

//TODO         Advantage:
//TODO         1. easy to memorize
//TODO         2. easy to read
//TODO         3. reusable
//TODO         4. flexible

//TODO         9) Can you overload main method?

//TODO         All methods including main method can be overloaded.
//TODO         When It comes to main method, It can be overloaded technically, but no point.


//TODO         10) What is method overriding?

//TODO         We are overriding the method.

//TODO         -Implemantation is changing
//TODO         - Inheritance is a must
//TODO         - Acces modifier must be same or more visible
//TODO         - healthy way for java memory


//TODO         11) What does static mean in Java?

//TODO        Static means one copy
//TODO        We do not need to create objects to call static methods and variables.
//TODO        Static blocks get executed first.
//TODO        method, variable and blocks can be static


//TODO        Here What Happens:

//TODO        public static void main(String[] args) {
//TODO        System.out.println("I am from the main method");

//TODO        Hello();

//TODO        }

//TODO        Static {

//TODO        System.out.println("I am from the static block");
//TODO        }



//TODO        public static void Hello () {
//TODO        System.out.println("I am from the custom method");
//TODO        }