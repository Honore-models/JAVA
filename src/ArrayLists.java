import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {

//        ArrayLists are dynamic arrays unlike normal arrays that don't change in size

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Pear");

//        fruits.remove(3);
//        fruits.set(1, "Strawberry");
        System.out.println(fruits.get(2));
        System.out.println(fruits.size());

        Collections.sort(fruits);

        System.out.println(numbers);
        System.out.println(fruits);
    }
}
