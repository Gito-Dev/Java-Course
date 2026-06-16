package conditionals;

public class IfStatements {
    public static void main(String[] args) {

        // Current x is bigger there for  X is greater than y
        // To trigger else change the symbol <,> or the value of the numbers.
        int x = 20;
        int y = 15;
        if (x > y) {
            System.out.println("X is greater than y");
        } else {
            System.out.println("Y is greater than x");
        }

        // if else, if, else.
        int time = 18;

        if (time < 10) {
            System.out.println("Good Morning.");
        } else if (time < 18) {
            System.out.println("Good day");
        } else {
            System.out.println("Good Evening");
        }

        // Ternary Operators
        int marks = 25;
        String results;
        results = (marks < 35) ? "Not completed." : "Completed";
        System.out.println(results);
    }
}
