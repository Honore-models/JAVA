import java.util.Random;
import java.util.Scanner;

public class RandomN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Random random = new Random();
//
//        int number = random.nextInt(1,11);
//        System.out.println(number);
//
//        boolean isYoung = random.nextBoolean();
//        System.out.println(isYoung);
//
//        System.out.printf("Hello i got %d",  number);
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        int index = email.indexOf("@");
        String username = email.substring(0, index);
        System.out.printf("Your username is %s", username);


    }
}