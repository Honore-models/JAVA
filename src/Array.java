import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        // NOTE: The size of an array is immutable once created

//        String[] fruits = {"Mango", "Orange", "Apple"};
//
//        Arrays.sort(fruits);
//        Arrays.fill(fruits, "Honore");
//
//        for(String fruit : fruits){
//            System.out.print(fruit + " ");
//        }
//
//        int[] ages = new int[2];
//        ages[1] = 12;
//
//        String[] array = new String[5];
//
//        array[0] = "Mango";
//        array[1] = "Orange";
//
//        System.out.println(Arrays.toString(array));

        String[] fruits = {"Mango", "Apple", "Banana", "Pear", "Cherry"};
        String[] vegetables = {"Dodo", "Pinch", "Cabbage", "RoseMary", "Tomato"};
        String[] meats = {"Pork", "Beef", "Goat", "Fish", "Chicken"};

        String[][] foods = {fruits, vegetables, meats};

        for(String[] food : foods){
            for(String i : food){
                System.out.println(i);
            }
        }


    }
}
