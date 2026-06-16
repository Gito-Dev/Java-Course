package basics;

public class Datatypes {

    // Data Types Primitive Types   (not all included down)
    // Java Data Types
    // int myId =25 ;  - integer  (whole number)
    // float myFloatNum = 6.99f ; - Floating point number
    // char myStatus = 'A' Character
    // boolean isWorking = true ;  boolean 1 or 0 - true or false
    // string myName = "Marry" String

    // Data types   (non primitive types)
    // string, arrays, classes, interface.

    public static void main(String[] args) {

        // Number Data types
        byte myByte = 100;
        System.out.println(myByte);
        // short has a maximum of  32767 only if  32768 = error.
        short srt = 32767;
        System.out.println(srt);
        // double you can add up to 15 numbers behind the . soo 1.123...15
        double dbl = 20.99d;
        System.out.println(dbl);

        // Character Data types
        char myGrade = 'A';
        System.out.println(myGrade);
        // ASCII table numb will be = to a letter
        char myRank = 45;
        System.out.println(myRank);

        /*
          Data Types (Primitive Vs. Non primitive)
            • The main difference between primitive and non-primitive data types are:
            • Primitive types are predefined Types in Java.
            • Non-primitive types are created by the software developer and is not defined by Java (except for String).
            • Non-primitive types can be used to call methods to perform certain functions, while primitive types cannot.
            • Primitive type has  always a value, wile non primitive types can be null.
            • Primitive types starts with a lowercase letter (int, char), while non primitive types
            starts with an uppercase letter (string and class).
         */

        // IDENTIFIERS
        // minutes per hour unique identifier.
        int minutesPerHour = 60;
        // m is considered as bad identifier as it is not easy to read.
        int m = 60;
    }
}
