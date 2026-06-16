package basics;

public class Variables {
    public static void main(String[] args) {
        // string for variables with words
        String Name = "User";
        String Country = "Germany";
        // how to print a string variable - sys out (string name)
        System.out.println(Name);
        System.out.println(Country);
        // int is for variables for numbers  only
        int age = 21;
        System.out.println(age);

        // it wont include the .o zero on the out put
        float price = 25.30f;
        System.out.println(price);

        // for example car model merceds, bmw , audi
        char status = 'P';
        System.out.println(status);

        boolean supply = true;
        System.out.println(supply);

        /*The answer or out put
         * User
         * Germany
         * 21
         * 25.3
         * P
         * true
         */

        // GENERAL RULES.
        // String name can contain letters, underscore, and dollar signe
        String first_name = "gito";
        // variables name must start with a letter only.
        // lowercase letters ex : name
        // no white space in variables Ex: first name - wrong only with first_name or firstname.
        // names begins with $name or _name will also work "nor recomended "
        // Case sensitve: myName and MyName both diffrent will not be same varibale. "java is a case-sensitive language"

        // WRITING MULTPLE VARIBALES
        int x = 20;
        int z = 20;
        int y = 20;
        System.out.println(x + z + y);
        // Output = 60
        // Short cut  int x = 20, y = 20, z = 20;
        int a = 20, b = 10, c = 20;
        System.out.println(x + z + y);
        // you can also declare all variables then later give them values
        int q, w, e;
        q = w = e = 10;
        System.out.println(q + w + e);
    }
}
