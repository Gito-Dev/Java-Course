package strings;

public class Strings {
    public static void main(String[] args) {

        // Strings are a collections of characters surrounded by ""
        String greetings = "Hello i am  Java Developer";
        System.out.println(greetings);
        String mobile = "2487520845";
        // numbers shouldn't be taken as strings or text
        System.out.println(mobile);

        // Build in methods and functions

        String text = "ABCDEFGHIJKLMNOPQRSTUWXYZ ";
        System.out.println("The length of text string is :" + text.length());
        //The length of text string is :26

        // Uppercase and Lowercase
        String hello = "Welcome ";
        System.out.println(hello.toUpperCase());
        System.out.println(hello.toLowerCase());
        // Hash generator
        System.out.println(hello.hashCode());

        // String indexing index of ()
        String txt = "Please locate where usa country";
        System.out.println(txt.indexOf("usa"));

        // Concatenation in String +

        String first_name = "Mery";
        String last_name = "Alice";
        System.out.println(first_name + " " + last_name);

        // concat()

        System.out.println(first_name.concat(last_name));

        // String with numbers

        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println(z);

        // string with + operator
        String a = "20";
        String b = "23";
        String c = a + b;
        // will be 2030 as it categorizes as text rather than numbers.
        System.out.println(c);
        // string with number
        String e = "10";
        int f = 20;
        String g = e + f;
        System.out.println(g);
        // 1020

        // String with special characters
        // \", \', \n, \t
        //    \"Coders\"  the two \\ will print the word with ""
        String msz = "We are the so-called \"Coders\" from the computer scinece";
        System.out.println(msz);

        // \n new line break
        String str = "It's a \nJava Development";
        System.out.println(str);

        // \n Adds another space
        String str2 = "It's a \tJava Development";
        System.out.println(str2);
    }
}
