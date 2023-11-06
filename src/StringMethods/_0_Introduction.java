package StringMethods;

import java.util.Arrays;

/*
TODO String Class

We have 8 Primitive Datatypes:

Here are some common data types listed from smallest to largest:
TODO   *** Boolean< Byte<Short< Integer< Long< Float< Double< Decimal ***

TODO Boolean: A Boolean data type can store either true or false.
It typically takes up one bit of memory.

TODO Byte: A byte is a data type that can store a single 8-bit value.
It can represent values between 0 and 255.

TODO Short: A short is a data type that can store a 16-bit value.
It can represent values between -32,768 and 32,767.

TODO Integer: An integer is a data type that can store a 32-bit value.
It can represent values between -2,147,483,648 and 2,147,483,647.

TODO Long: A long is a data type that can store a 64-bit value.
It can represent values between -9,223,372,036,854,775,808
and 9,223,372,036,854,775,807.

TODO Float: A float is a data type that can store a 32-bit floating-point value.
It can represent both integer and fractional values.

TODO Double: A double is a data type that can store a 64-bit floating-point value.
It can represent both integer and fractional
 values with higher precision than a float.

TODO Decimal: A decimal is a data type that can store a fixed-point decimal
value with a variable number of decimal places.
It is often used for financial calculations.

TODO                 !!!STRINGS ARE NOT PRIMITIVE DATATYPES!!!

Arrays is a set, sequence of variables.

TODO            !!Strings is a set,sequence of chars!!

"Java"->'J','a','v','a'
char text[]={'J','a','v','a'};

Char can not accept 2 or more symbols!
Char can accept only one symbol!
Space is also a symbol.

TODO Methods of String:

 */
public class _0_Introduction {
    public static void main(String[] args) {


//TODO length() Method: Return us lenght of charArray.
        String text1 = "I love JAVA";
        System.out.println(text1.length());//11

//TODO charAt Method: Return us selected index number as String format.
        String text2 = "I love JAVA";
        System.out.println(text2.charAt(0));//I

        System.out.println(text2.charAt(text2.length() - 3));//A
        System.out.println(text2.charAt(1));//Console shows us nothing.

//TODO Concat Method: Concatenated 2 string as a one string without space between them.
        String text3 = "Ozgur";
        String text4 = "Gogersin";
        System.out.println(text3.concat(text4));//OzgurGogersin

        String result = text3.concat(text4);
        System.out.println("result = " + result);

//TODO Contains Method : Return us true if text is existing in text.
        String text5 = "Hello Java";
        String text6 = "ll";
        System.out.println(text5.contains(text6)); // True
        System.out.println(text6.contains(text5)); // False
        System.out.println(text5.contains("ello"));// True

//TODO Equals Method : Check if my text1 is equal text2, like integers ==.
        String text7 = "Hello";
        String text8 = "HELLO";
        String text9 = "Hello";
        System.out.println(text7.equals(text9));// True
        System.out.println(text7.equals(text8));// False

//TODO toLowerCase : Converts all chars of text into lower case.
        String text10 = "HeLlO.";
        System.out.println(text10.toLowerCase()); // hello.

//TODO toUpperCase : Converts all chars of text into upper case.
        String text11 = "Convert my chars TO uppercase";
        System.out.println(text11.toUpperCase());//CONVERT MY CHARS TO UPPERCASE

//TODO EqualIgnoreCase  : Compare 2 strings without any case. Result will be Boolean.
        String text12 = "Just Check me";
        String text13 = "just CHECk me";
        System.out.println("equalsIgnoreCase: "+text12.equalsIgnoreCase(text13)); //True
        System.out.println("equalsIgnoreCase: "+text12.equalsIgnoreCase("JUST Check me"));//True
        System.out.println("equalsIgnoreCase: "+text12.equalsIgnoreCase("JUST Check me "));//False
        System.out.println("equalsIgnoreCase: "+text12.equalsIgnoreCase("This is not same"));//False

//TODO indexOf : This method returns us index of ' ' in text,
// otherwise it returns -1 if it doesn't exist in text.
        String text14 = "Hello World";
        System.out.println(text14.indexOf(' '));// 5
        System.out.println(text14.indexOf('e'));// 1
        System.out.println(text14.indexOf('k'));//-1

//TODO isEmpty
        String text15 = "Hi";
        String text16 = "";
        System.out.println(text15.isEmpty());// False
        System.out.println(text16.isEmpty());// True

//TODO lastIndexOf : Starting to check from the End!
        String text17 = "Hello Java";
        //             0123456789
        System.out.println("lastIndexOf"+text17.lastIndexOf("e"));
        System.out.println("lastIndexOf"+text17.lastIndexOf("l"));
        System.out.println("lastIndexOf"+text17.lastIndexOf("a"));

//TODO substring : Return us as a text which started from beginning index,
// and en with ending index.
        String text18 = "Substring";
        //             012345678
        System.out.println(text18.substring(3, 8));// strin
        //begining index included but ending index not included.
        System.out.println(text18.substring(0, 2));//Su
        System.out.println(text18.substring(0, 9));//Substring
        System.out.println(text18);//Substring

//TODO endsWith: Returns boolean.
        String text19 = "Hello            JAVA";
        System.out.println(text19.endsWith("JAVA"));//True
        System.out.println(text19.endsWith("JAva"));//False

//TODO startsWith: Returns boolean.
        String text20 = "Hello            JAVA";
        System.out.println(text19.startsWith("He"));//True
        System.out.println(text19.startsWith("lo"));//False

//TODO replace : Replace string in given text.
        String text21 = "TechnoXStudy";
        System.out.println(text21.replace("X", " "));//Techno Study

//TODO replaceFirst : Replace first char of a string in given text.
        String text22 = "bechno Study";
        System.out.println(text22.replaceFirst("b", "T"));//Techno Study

//TODO trim : will remove all space between text.
        String text23 = "   I have 3 space in my starting and after ending point   ";
        System.out.println(text23);
        System.out.println(text23.trim());

//TODO Split Method : split a string into an array of substrings based on a specified delimiter.
        String text24 = "Use split method to divide me to the words.";
        String text25 = "apple,banana,pear";
        String[] splitText1 = text24.split(" ");//if not use space will divide to char.
        String[] splitText2 = text25.split(",");
        System.out.println(Arrays.toString(splitText1));//[Use, split, method, to, divide, me, to, the, words.]
        System.out.println(Arrays.toString(splitText2));//[apple, banana, pear]

//TODO toString Method : Convert charr array to string.
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        char[] arr2 = {'J', 'a', 'v', 'a'};
        System.out.println(Arrays.toString(arr2));//Java


//TODO toCharArray Method : Convert String to Char;
        String text26 = "Ozgur Gogersin";
        char[] arr1 = text26.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");//O z g u r   G o g e r s i n

        }
        System.out.println();

//TODO Arrays.sort Method : Sort the array with ascending order.
        int[] arr3 = {5, 4, 3, 2, 1};
        char[] arr4 = {'d', 'c', 'b', 'a'};
        String[] arr5 = {"o", "z", "g", "u", "r", "0", "5"};

        Arrays.sort(arr3);//[1, 2, 3, 4, 5]
        Arrays.sort(arr4);//[a, b, c, d]
        Arrays.sort(arr5);//[0, 5, g, o, r, u, z]

        System.out.println("int arr3 converted to string and Sorted : " + Arrays.toString(arr3));
        System.out.println("Char arr4 converted to string and Sorted : " + Arrays.toString(arr4));
        System.out.println("String arr5 converted to string and Sorted : " + Arrays.toString(arr5));

//TODO  Arrays.deeptoString Method :How can we print whole multi dimensional array?
        int[][] multiArray = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Arrays.deepToString(multiArray) = " + Arrays.deepToString(multiArray));
//TODO RepeatingString Method :
        String text="hello";
        System.out.println(text.repeat(4)+"java");
    }
}
