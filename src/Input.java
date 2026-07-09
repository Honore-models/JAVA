import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your home: ");
//        String home = scanner.nextLine();
//        System.out.println("Enter your age: ");
//        int age = scanner.nextInt();
//        System.out.println("Enter your GPA: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.println("Your home is " + home);
//        System.out.println("Your age is " + age);
//        System.out.println("Your GPA is " + gpa);
//        scanner.close();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the item you want to buy: ");
        String item = scanner.nextLine();
        System.out.print("How much is each?: ");
        double price = scanner.nextDouble();
        System.out.print("How many " + item + "s Do you want to buy?: ");
        int number = scanner.nextInt();

        double total = price * number;

        System.out.print("You bought " + number);
        System.out.println(" " + item + "s.");
        System.out.print("You will pay " + total + "Frw.");

    }
}
