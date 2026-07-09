public class Main {

    public static void main(String[] args) {

//        System.out.println("I like pizza");
//        System.out.println("It's really good!");
//        System.out.println("By me Pizza!");

        String name = "Honore";
        String home = name;
        home = "kayonza";

        int[] arr = {1,2,3,4};
        int[] changed = arr;
        changed[0] = 15;

        int age = 20;
        int year = age;
        year = 21;

        System.out.println(year);
        System.out.println(age);
        System.out.println("Hello, " + name);
        System.out.println(arr[0]);
        System.out.println(arr);

    }
}
