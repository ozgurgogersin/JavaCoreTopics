package OOP;

import java.util.function.ToDoubleBiFunction;

public class _0_Introduction {
    // TODO
    //   Question 1 - What does Object Oriented Programming (OOP) mean?
    //   Why are OOP languages mostly used in the IT industry?

    //TODO
    // ANSWER:
    // OOP, which is the abbreviation of Object
    // Oriented Programming, is a programming language
    // model that provides coding by centering the only
    // objects instead of operations, actions or activities.
    // This form of programming is totally based on the real
    // world, greatly simplifies development and
    // maintenance, provide data hiding and provide that
    // data is kept more secure. I allows us time saving while creating products.
    //----------------------------------------------------------------------------

    //TODO Question 2 - What are the 4 basic principles of Object Oriented
    // Programming (OOP)? What are OOP concepts?

    //TODO
    // 1)Encapsulation: It allows us to prevent direct access to the data by setting the privacy of the data, thus
    // making the data at hand more secure and preventing it from being changed inadvertently. When we need
    // to change the data, we use getter & setter methods to access and modify the data indirectly. This increases
    // security.
    // The choice of access modifiers depends on the desired level of encapsulation and the intended usage
    // of the class members.
    //TODO
    //      a-)Public: Public members are accessible from anywhere in the program.
    // They can be accessed by other classes, objects, or even outside the class hierarchy.
    //      b-)Protected: Protected members are accessible within the class where they are declared and in derived classes.
    //    // They cannot be accessed by objects of the class or from outside the class hierarchy.
    //      c-)Default (or Package-Private): In some languages, there is an additional access level,
    //    // which is the absence of an explicit access modifier.
    //    // Members with default access are accessible within the same package or module.
    //    // They are not accessible from outside the package or module.
    //      d-)Private: Private members are only accessible within the class where they are declared.
    //    // They cannot be accessed by any code outside the class, including derived classes or other objects.


    //TODO
    // 2)Abstraction: It allows us to hide complex inner structure of an object and show the user just what that
    // object
    // does. Thanks to Abstraction, we see what an object does, but we don't know how it does it. This allows user
    // to easily understand only the actions of the object, rather than having to deal with the complex processes
    // inside.

//    abstract class Shape {
//        public abstract void draw(); // abstract method
//
//        public void display() {
//            System.out.println("Displaying shape."); // non abstract metod
//        }
//    }
//
//    class Circle extends Shape {
//        @Override
//        public void draw() {
//            System.out.println("Drawing a circle."); //non absract
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            Circle circle = new Circle();
//            circle.draw();    // Implementing the abstract method
//            circle.display(); // Inheriting the concrete method
//        }
//    }


    //TODO
    // 3)Inheritance: It is used to describe the relationship between two classes.
    // Two classes that have a hierarchical
    // relationship between them, for example, animal and dog, are divided into parent class and child class,
    // respectively, and the animal parent class can inherit many other classes within this class.
    // Inheritance allows
    // us to avoid code redundancy and write the common properties of two objects of the same type once.
//    class Animal {
//        protected String name;
//
//        public void eat() {
//            System.out.println("The animal is eating.");
//        }
//    }
//    class Dog extends Animal {
//        public void bark() {
//            System.out.println("The dog is barking.");
//        }
//    }
//    public class Main {
//        public static void main(String[] args) {
//            Dog dog = new Dog();
//            dog.name = "Buddy";
//            dog.eat(); // Inherited method from Animal class
//            dog.bark(); // Method specific to Dog class
//        }
//    }

    //In the above example, the Animal class is the superclass, and the Dog class is the subclass.
    // The Dog class inherits the name field and the eat() method from the Animal class.
    // It also adds its own method, bark().
    // The Main class demonstrates the usage of the Dog class, where we create a Dog object and call its inherited and subclass-specific methods.


    //TODO
    // 4)Polymorphism: Makes an object behave in two different ways. For example, when you create an object with
    // polymorphism, this object will have the behavior of both the classes it was created from.
    // TODO 1)Method Overridding;
    //  Method overriding are determined at compile-time
//    class Animal {
//        public void makeSound() {
//            System.out.println("Animal is making a sound.");
//        }
//    }
//
//    class Dog extends Animal {
//        @Override
//        public void makeSound() {
//            System.out.println("Dog is barking.");
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            Animal animal = new Animal();
//            animal.makeSound(); // Output: Animal is making a sound.
//
//            Dog dog = new Dog();
//            dog.makeSound(); // Output: Dog is barking.
//
//            Animal polymorphicDog = new Dog(); // Polymorphic assignment
//            polymorphicDog.makeSound(); // Output: Dog is barking.
//        }
//    }
    // TODO 2)Method Overloading;
    //  Method overriding are determined at compile-time

//    class Calculator {
//        public int add(int a, int b) {
//            return a + b;
//        }
//
//        public double add(double a, double b) {
//            return a + b;
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            Calculator calculator = new Calculator();
//            int sum1 = calculator.add(3, 4);          // Calls the first add() method
//            double sum2 = calculator.add(2.5, 3.5);   // Calls the second add() method
//
//            System.out.println("Sum 1: " + sum1);     // Output: Sum 1: 7
//            System.out.println("Sum 2: " + sum2);     // Output: Sum 2: 6.0
//        }
//    }
    //----------------------------------------------------------------------------
    //TODO
    // Question 3 - What is the difference between Abstract Class and Interface?
    // ANSWER: An abstract class is created with the "abstract" keyword and can contain
    // both abstract methods and non-abtract methods, as well as variables. In addition to
    // that, an abstract class is inherited and used with the "extend" keyword. Interface is
    // created with the "interface" keyword and can contain only abstract methods,
    // default methods, static methods and public final static variables. And it is used with
    // the "implement" keyword.
    // Both abstract class and interface are used to provide abstraction and you cannot
    // create new objects from abtract classes and interfaces.
    //------------------------------------------------------------------------------
    //TODO
    // Question 4 - What are Access Modifiers? What is it used for? Can you tell us about
    // the types of access modifiers
    // and their access levels?
    // ANSWER: Access modifiers allow us to specify the access level of classes, variables,
    // methods, and constructors. Access modifiers allow, for example, to increase the security
    // of variables and methods by specifying the level of access. There are 4 different access
    // modifiers in Java. These are:
    //TODO
    //   PUBLIC   : Accessible from everywhere.
    //   (Within Class, Package, Package by subclasses, outside Package by SubClasses,Global)
    //   PROTECTED: Accessible from  same package +
    //   if you are in a sub-class if even you are in different package it is visible again.
    //   DEFAULT  : Accessible from same package  ( you can not access to child or subclass from different package.)
    //   PRIVATE  : Accessible only from the same Class.
    //--------------------------------------------------------------------------------
    //TODO
    // Question 5 -What are the differences between constructor and method?

    //TODO
    //          public Vehicle() {
    //TODO
    //          }
    // --->Constructor---< does not have a return type, name of the constructor must be same as the class name.
    // Constructor is called automatically when an object is created, and the Java compiler automatically
    // Creates a default constructor if you haven't created one. Constructors are not inherited by child classes.

    //TODO
    // --->Methods---< have a return type and the method name can be the same as the class name,
    // but not necessarily. To use methods, you need to call them explicitly and if you don't
    // have a method, the Java compiler won't create a default method. In order for the
    // method to be used, it must be written by the programmer. In addition, child classes can
    // inherit the methods of a class and can use them.
    //TODO
    //          public void Vehicle(String name) {
    //TODO
    //          }
    //TODO
    //          public String Vehicle(String name) {
    //TODO
    //          }
    //TODO
    //--------------------------------------------------------------------------------
    //TODO Question 6 - What are the main differences between Method Overloading and Method Overriding?
    //TODO
    // --->Method Overloading---< can be expressed as defining methods with the same name but different signatures
    // (type,number, order of parameters) within a class.
    // Methods with the same names and same parameters and at the same class but with different parameters
    // are called overloading.
    // TODO    -Method overloading is used to increase the readability of the program.
    //         -Method overloading is performed within class.
    //         -In case of method overloading, parameter must be different.
    //         -Method overloading is the example of compile time polymorphisim.
    //         -In java, method overloading can't be performed by changing return type of the method only.
    //          Return type can be same or different in method overloading. But you must have to change the parameter.

    //TODO         public String Vehicle(String name) {
    //TODO              sout hello
    //          }
    //TODO
    //          public String Vehicle(String name,String brand) {
    //TODO              sout hello
    //          }
    //TODO
    // --->Overriding---< is called recreating and replacing a method belonging to the parent class (super class)
    // with the same parameters but different method bodies in a class derived from that class (child class).
    // In other words, methods with the same name and parameters but with different bodies in different classes with a parentchild
    // relationship are called as overriding,
    // TODO    -Method overriding is used to provide the specific implementation of the method that
    //  is already provided by its super class
    //         -Method overriding occurs in two classes that have inheritace relationship.
    //         -In case of method overriding, parameter must be same.
    //         -Method overriding is the example of run time polymorphisim.
    //         -In java, method overloading can't be performed by changing return type of the method only.
    //         -Return type can be same or covariant in method overriding.
    //TODO
    // class Cat extends Animal {
    //        @Override
    //        public void makeSound() {
    //            System.out.println("Meow!");
    //        }
    //    }
    //TODO
    //   class Dog extends Animal {
    //        @Override
    //        public void makeSound() {
    //            System.out.println("Woof!");
    //        }
    //    }
    //--------------------------------------------------------------------------------
    //TODO Question 7- What are the differences between Set, List and Map in Java?
    //TODO Set, List and Map are three important interfaces in the Java collection framework.
    // --->Set---<
    //     Set provides an unordered collection and does not contain the same object. All
    //     objects are unique. If you don't want objects to be duplicated in your project,
    //     choose Set.
    //TODO
    // --->List---< provides an ordered and indexed collection and can contain identical objects. If
    //      you need to invoke objects with index frequently in your project and you will store
    //      identical objects, List is the best because ArrayList provides the fastest access to
    //      objects because it stores objects by index.
    //
    //TODO
    // --->Map---< provides a data structure in the form of Key and Value. Key is always unique,
    //     while Value can duplicate, so there can be other objects with the same value but
    //     with different Key. If you need to store your data in Key-Value storage format, go
    //     with the Map interface.
    //--------------------------------------------------------------------------------
    //TODO Question 8- What are the main differences between Array and ArrayList?
    // Array is part of Core Java programming and has a
    // special syntax. ArrayList is part of collection framework and
    // uses List interface.
    //
    //TODO
    // The length of the Array is determined when it is first created
    // and cannot be changed later, while the ArrayList is resizable. Its
    // size changes as you add elements to your list.
    //TODO
    // Array can contain both primitive data types and objects (object), while ArrayList
    // can contain Wrapper classes and object.
    // List<Book> books = new ArrayList<>();
    // It cannot contain primitive data. To get the length of the Array we use array.length but to get the
    // size of the ArrayList we use the method arrayList.size() .
    //--------------------------------------------------------------------------------
    //TODO Question 9- Can you give a real-life example of Polymorphism?
    //  Some of the real time example of polymorphism are:
    //TODO
    //  1-One of the best real time example of polymorphism is Women in the society.
    //  The same woman performs different role in society.The woman can be wife of someone, mother of her child, can be at role of manager in organisation
    //  and many more at the same time.
    //  But the Woman is only one. So, same woman performing different roles is polymorphism.
    //  2-Another good real time example of polymorphism is water.
    //  Water is a liquid at normal temperature, but it can be changed to solid when it frozen, or same water changes to a gas when it is heated at its boiling point.
    //  Thus, same water exhibiting different roles is polymorphism.
    //  ***(3)-Even animals are great real life example of polymorphism, if we ask different animals to speak, they respond in their own way.
    //  Like if we ask Dog to speak it will bark,  cow will moo, cat will meow.
    //  So the same action of speaking is performed in different ways by different animals exhibiting polymorphism.
    //  4-Another excellent real time example of polymorphism is your smartphone.
    //  The smartphone can act as phone, camera, music player and what not, taking different forms and hence polymorphism
    //  ****(5)-Behaviour of humans can also be considered real time example of polymorphism.
    //  Like a person behaves differently with different person.The person can be causal with his friends, professional with
    //  his colleagues and seniors.
    //  Thus Person which is object here shows different behaviour in different situation.
    //--------------------------------------------------------------------------------
    //TODO Question 10- Why isn't Java 100% object oriented?
    // Java is not 100% object oriented
    // because it supports 8 different primitive data types: boolean, byte, char, int, float, double, long, short.
    // This means that Java is not 100% object oriented.
    // Otherwise In an object-oriented manner we can say classes, objects, encapsulation, inheritance,
    // and polymorphism as core features,
    // also oop provides use safe ,modular, flexible, and maintainable code .


}
