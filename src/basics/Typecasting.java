package basics;

public class Typecasting {
    public static void main(String[] args) {

        // Widening casting (Automatically converted)
        // small type to larger type
        // byte -> short -> int -> long -> float -> double

        int myNum = 20;
        double myDouble = myNum;

        System.out.println(myNum);
        System.out.println(myDouble);

        // Narrow casting (Manually)
        // larger type to small type data
        // double -> float -> long -> int -> short -> byte

        double myAge = 9.75d;
        // Manual casting to convert a number
        int my_age = (int) myAge;

        System.out.println(myAge);
        System.out.println(my_age);
    }
}
