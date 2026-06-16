package operators;

public class Comparison {
    public static void main(String[] args) {

        // Comparison arguments
        // == if two values are equal
        // != if two values aren't equal
        // <,> greater or less than  =< equal or less >= greater or equal too

        int x = 5;
        int y = 5;

        System.out.println(x == y);
        // True
        System.out.println(x != y);
        // False as they are the equal

        int c = 5;
        int d = 3;

        System.out.println(c == d);
        // False they are not equal
        System.out.println(c != d);
        // True

        System.out.println(c < d);
        // False
        System.out.println(c > d);
        //True
    }
}
