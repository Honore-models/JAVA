import java.util.Scanner;
import java.util.Arrays;

public class Search {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array you want: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        for(int i = 0; i < array.length; i++){
            System.out.printf("Enter number %d: ", i+1);
            array[i] = scanner.nextInt();
        }

        System.out.printf("You entered %d numbers: \n", length);
        System.out.printf("Your array is: %s\n", Arrays.toString(array));

        System.out.print("Enter the element you want to search: ");
        int element = scanner.nextInt();

        for(int i=0; i<array.length; i++){
            if(array[i] == element){
                System.out.printf("Element %d is found at index %d\n", element, i);
                break;
            }
        }

    }
}
