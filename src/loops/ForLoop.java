package loops;

public class ForLoop {
    public static void main(String[] args) {

        // For loop
//        for (int i = 0 ; i<=5; i++ ){
//                  System.out.println(i);
//        }

//        // Nested Loop
//
//        // Outer loop statment
//        for (int i = 0 ; i <= 2 ; i++){
//            System.out.println( "Outer loop : " + i);
//
//            for ( int j = 1; j <= 100; j++ ){
//                System.out.println("Inner loop :" + j);
//            }
//        }

//        // For each statment
//        String[] sports ={"Cricket" , "Tenis" , "Football"};
//
//        // i: giving a shortcut to the word sports as alias
//        for (String i:sports){
//            System.out.println(i);
//        }
//
//

        // break // continue
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                System.out.println("I am Reached " + i);
                continue; // break or continue as a word here
            }
            System.out.println(i);
        }
    }
}
