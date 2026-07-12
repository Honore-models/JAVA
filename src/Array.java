import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        // NOTE: The size of an array is immutable once created

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
