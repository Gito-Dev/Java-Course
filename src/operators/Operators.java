package operators;

public class Operators {
    public static void main(String[] args) {
        // +, -, *, /

        int x = 5;
        int y = 10;
        System.out.println(x + y);
        //15
        System.out.println(x * y);
        //50
        System.out.println(y / x);
        //2
        System.out.println(y - x);
        //5

        int tot1 = 100 + 50;
        int tot2 = tot1 + 200;
        int tot3 = tot1 + tot2;

        System.out.println(tot1);
        System.out.println(tot2);
        System.out.println("The sum of tot3 :  " + tot3);

        //BODMAS AND OR , PODMAS

        // INCREMENT OR DECREMENT OPERATORS
        // ++ OR --

        int a = 5;
        ++a;    // the variable is incremente by +1
        System.out.println(a);

        //System.out.println(a++); you can also add it inline on the print function.

        int b = 5;
        --b;    // the variable is decremented -1
        System.out.println(b);

        // Assigment Operators

        int num = 10;
        num += 5;
        // it will add 5 = 15
        System.out.println(num);

        num -= 3;
        // It will remove 3 = 12
        System.out.println(num);

        // Same for * and : or /
    }
}
