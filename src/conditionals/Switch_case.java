package conditionals;

public class Switch_case {
    public static void main(String[] args) {

        // switch case
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednsday");

            case 4:
                System.out.println("Thursday");

                break;
            default:
                System.out.println("you have to select a correct option ");
        }
    }
}
