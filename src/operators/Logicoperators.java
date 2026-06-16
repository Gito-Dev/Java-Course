package operators;

public class Logicoperators {
    public static void main(String[] args) {

        /*
=========================================
LOGICAL OPERATORS TRUTH TABLE
=========================================

A      B      A && B      A || B      !A
-----------------------------------------
true   true   true        true        false
true   false  false       true        false
false  true   false       true        true
false  false  false       false       true

Explanation:
&& (AND)  -> true only when both A and B are true.
|| (OR)   -> true when at least one of A or B is true.
!  (NOT)  -> reverses the value of A.

=========================================
*/

        // Logic AND operator
        int x = 10;
        // TRUE as x is bigger than 5 and smaller than 20.
        System.out.println(x > 5 && x < 20);
        // FALSE as the x is smaller than 15.
        System.out.println(x > 15 && x < 20);

        // Logic OR operator
        int y = 5;
        System.out.println(x > 3 || x < 4);

        // x > 3  -> 10 > 3  -> true
        // x < 4  -> 10 < 4  -> false
        //
        // OR operator (||) returns true if at least one condition is true.
        //
        // true || false -> true

        // Logic Operator  NOT
        System.out.println(!(x > 5 && x < 20)); // false because (10 > 5 && 10 < 20) is true, and NOT (!) changes true to false
        System.out.println(!(x > 3 || x < 4)); // false because (10 > 3 || 10 < 4) is true, and NOT (!) changes true to false
    }
}
