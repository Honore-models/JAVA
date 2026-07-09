public class Methods {

    public static void main(String[] args) {

        int width = 10;
        int height = 15;
        int area = area(width, height);
        System.out.println("Area is " + area);

        String firstName = "NIYOGUSHIMWA";
        String lastName = "Honore";

        String fullName = fullName(firstName, lastName);
        System.out.println("Full name is " + fullName);

    }

    static int area(int width, int height){
        return width * height;
    }

    static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
}

// Static methods and variables are variables and methods that belong to a class itself not a specific
// instance of a class , when you create a static method it is to say that that method will remain the same
// for all instances that will be created from that class i.e. all instances  of that class will use the
// same method unchanged.

// The static method can only use static methods and variables because it cannot access self keyword
// which is only used by dynamic methods to access other methods.