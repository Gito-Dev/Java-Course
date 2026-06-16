package input;

import java.util.Scanner;
// import the scaner
public class User_inputs {
    public static void main(String[] args) {

        // Accept the user input
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("User entered number : " + number);

        // String Assignment
        System.out.println("Enter a name: ");
        String str = scanner.next();
        System.out.println("User entered number : " + str);
    }
}
