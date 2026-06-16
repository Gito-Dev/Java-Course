package datetime;

public class MathDatatime {

    public static void main(String[] args) {

        // max and min
        int x, y;
        x = 4;
        y = 5;
        System.out.println(Math.max(x, y));
        // Max value will be printed = 5
        System.out.println(Math.min(x, y));

        // Sqaure root for given value

        int s = 64;
        System.out.println(Math.sqrt(s));

        // Absolute value finding from given
        // you get the opposite value
        System.out.println(Math.abs(-4.8));

        // Random number generator
        // Math.random()
        System.out.println(Math.random());

        // controll on random number
        int randomnum = (int) (Math.random() * 1001);
        System.out.println(randomnum);
    }
}
