import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {

        try{

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(9/0);
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide by zero");
        }
        catch(InputMismatchException e){
            System.out.println("That wasn't a number.");
        }

        System.out.println("Execution ended");


    }
}
