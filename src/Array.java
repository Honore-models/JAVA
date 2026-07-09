import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        String[] fruits = {"Mango", "Orange", "Apple"};

        Arrays.sort(fruits);

        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }


    }
}
