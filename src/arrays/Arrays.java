package arrays;

public class Arrays {
    public static void main() {

        // String data array
        String[] cars = {"Golf", "Bmw", "Mercedes Benz", "Audi"};
        // position 1 on a array is the se ond the first is 0 the output will give bmw
        System.out.println(cars[0]);

        // Will give 4 as there's only 4 cars
        System.out.println(cars.length);

        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == "golf") {
                break;
            }
        }

        // you can give a custom position to a arrey
//       cars[0] = "opel";

//       // Inteager data array
//       int [] price = {23, 45, 100, 300 } ;
//        System.out.println(cars[3]);
//        System.out.println(cars);

        for (String i : cars) {
            System.out.println(i);
        }

        // Multidimentional arreys
        // consists in rows and colums
        int[][] myNumber = {{1, 2, 3, 4}, {1, 2, 3, 4}};
        System.out.println(myNumber[1][2]);
    }
}
